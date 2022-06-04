import kotlin.math.abs

fun solveNQueens(n: Int) = sequence {
    val queens = IntArray(n)

    fun safe(row: Int, col: Int): Boolean =
        (0 until row).none { i -> abs(col - queens[i]).let { it == 0 || it == row - i } }

    suspend fun SequenceScope<List<String>>.rec(k: Int) {
        if (k == n) {
            yield(queens
                .map { i ->
                    (0 until n)
                        .map { j -> if (j == i) 'Q' else '.' }
                        .joinToString("")
                }
            )
        } else {
            (0 until n)
                .forEach {
                    if (safe(k, it)) {
                        queens[k] = it
                        rec(k + 1)
                    }
                }
        }
    }

    rec(0)
}

fun main() {
    solveNQueens(8)
        .take(3)
        .forEach { solution ->
            solution.forEach { row ->
                println(row)
            }
            println()
        }
}
import kotlin.math.abs

class SolveNQueens {
    fun solve(n: Int) = sequence {
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
                for (i in 0 until n) {
                    if (safe(k, i)) {
                        queens[k] = i
                        rec(k + 1)
                    }
                }
            }
        }

        rec(0)
    }
}

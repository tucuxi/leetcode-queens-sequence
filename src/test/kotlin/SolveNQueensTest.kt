import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolveNQueensTest {

    private val solver = SolveNQueens()

    @Test
    fun `1 by 1 board has one solution`() {
        assertEquals("[[Q]]", solver.solveNQueens(1).toList().toString())
    }

    @Test
    fun `2 by 2 board has no solution`() {
        assertTrue(solver.solveNQueens(2).toList().isEmpty())
    }

    @Test
    fun `3 by 3 board has no solution`() {
        assertTrue(solver.solveNQueens(3).toList().isEmpty())
    }

    @Test
    fun `8 by 8 board has 92 distinct solutions`() {
        assertEquals(92, solver.solveNQueens(8).toSet().size)
    }
}
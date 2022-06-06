import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SolveNQueensTest {

    private val solver = SolveNQueens()

    @Test
    fun `1 by 1 board has one solution`() {
        assertEquals("[[Q]]", solver.solve(1).toList().toString())
    }

    @Test
    fun `2 by 2 board has no solution`() {
        assertTrue(solver.solve(2).toList().isEmpty())
    }

    @Test
    fun `3 by 3 board has no solution`() {
        assertTrue(solver.solve(3).toList().isEmpty())
    }

    @Test
    fun `8 by 8 board has 92 distinct solutions`() {
        val res = solver.solve(8).toList()
        assertEquals(92, res.size)
        assertEquals(92, res.toSet().size)
    }
}

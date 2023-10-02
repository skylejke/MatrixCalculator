import org.junit.Assert.assertArrayEquals
import org.junit.Test

class SumMatricesTest {

    @Test
    fun `sumMatrices should return correct result for valid input`() {
        val matrixA = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
        )
        val matrixB = arrayOf(
            arrayOf(9, 8, 7),
            arrayOf(6, 5, 4),
            arrayOf(3, 2, 1)
        )

        val expectedSum = arrayOf(
            arrayOf(10, 10, 10),
            arrayOf(10, 10, 10),
            arrayOf(10, 10, 10)
        )

        val result = sumMatrices(matrixA, matrixB)
        assertArrayEquals(expectedSum, result)
    }

    @Test
    fun `sumMatrices should handle matrices with different dimensions`() {
        val matrixA = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6)
        )
        val matrixB = arrayOf(
            arrayOf(9, 8, 7),
            arrayOf(6, 5, 4),
            arrayOf(3, 2, 1)
        )

        val result = sumMatrices(matrixA, matrixB)
        assert(result == null)
    }
}
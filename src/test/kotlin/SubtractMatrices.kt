import org.junit.Assert
import org.junit.Test

class SubtractMatrices {

    @Test
    fun `subtractMatrices should return correct result for valid input`() {
        val matrixA = arrayOf(
            arrayOf(10, 10, 10),
            arrayOf(10, 10, 10),
            arrayOf(10, 10, 10)
        )
        val matrixB = arrayOf(
            arrayOf(9, 8, 7),
            arrayOf(6, 5, 4),
            arrayOf(3, 2, 1)
        )

        val expectedSum = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(7, 8, 9)
        )

        val result = subtractMatrices(matrixA, matrixB)
        Assert.assertArrayEquals(expectedSum, result)
    }

    @Test
    fun `subtractMatrices should handle matrices with different dimensions`() {
        val matrixA = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6)
        )
        val matrixB = arrayOf(
            arrayOf(9, 8, 7),
            arrayOf(6, 5, 4),
            arrayOf(3, 2, 1)
        )

        val result = subtractMatrices(matrixA, matrixB)
        assert(result == null)
    }

}
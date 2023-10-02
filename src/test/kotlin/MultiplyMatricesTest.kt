import org.junit.Assert
import org.junit.Test

class MultiplyMatricesTest {

    @Test
    fun `multiplyMatrices should return correct result for valid input`() {
        val matrixA = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))
        val matrixB = arrayOf(arrayOf(7, 8), arrayOf(9, 10), arrayOf(11, 12))
        val actualResult = multiplyMatrices(matrixA, matrixB)
        val expectedResult = arrayOf(arrayOf(58, 64), arrayOf(139, 154))
        Assert.assertArrayEquals(actualResult, expectedResult)
    }

    @Test
    fun `multiplyMatrices should handle the case when the number of columns of matrix A does not match the number of rows of matrix B`() {
        val matrixA = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))
        val matrixB = arrayOf(arrayOf(7, 8, 9), arrayOf(10, 11, 12))
        val result = multiplyMatrices(matrixA, matrixB)
        assert(result == null)
    }

}
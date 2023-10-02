
import org.junit.Assert.assertArrayEquals
import org.junit.Test

class TransposeMatrixTest {

    @Test
    fun transposeMatrixTest1() {
        val matrix = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))
        val actualResult = transposeMatrix(matrix)
        val expectedResult = arrayOf(arrayOf(1, 4), arrayOf(2, 5), arrayOf(3, 6))
        assertArrayEquals(actualResult, expectedResult)
    }

}
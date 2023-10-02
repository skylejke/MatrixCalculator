fun sumMatrices(matrixA: Array<Array<Int>>, matrixB: Array<Array<Int>>): Array<Array<Int>>? {
    val numRowsA = matrixA.size
    val numColsA = matrixA[0].size
    val numRowsB = matrixB.size
    val numColsB = matrixB[0].size

    if (numRowsA != numRowsB || numColsA != numColsB) {
        println("Невозможно выполнить операцию, так как матрицы не одинаковой рахмерности")
        return null
    }

    val result = Array(numRowsA) { Array(numColsB) { 0 } }

    for (i in 0 until numRowsA) {
        for (j in 0 until numColsB) {
            result[i][j] = matrixA[i][j] + matrixB[i][j]
        }
    }
    return result
}

fun subtractMatrices(matrixA: Array<Array<Int>>, matrixB: Array<Array<Int>>): Array<Array<Int>>? {
    val numRowsA = matrixA.size
    val numColsA = matrixA[0].size
    val numRowsB = matrixB.size
    val numColsB = matrixB[0].size


    val result = Array(numRowsA) { Array(numColsB) { 0 } }


    return result
}

fun main() {



}
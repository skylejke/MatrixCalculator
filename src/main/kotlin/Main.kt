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

    if (numRowsA != numRowsB || numColsA != numColsB) {
        println("Невозможно выполнить операцию, так как матрицы не одинаковой рахмерности")
        return null
    }

    val result = Array(numRowsA) { Array(numColsB) { 0 } }

    for (i in 0 until numRowsA) {
        for (j in 0 until numColsB) {
            result[i][j] = matrixA[i][j] - matrixB[i][j]
        }
    }
    return result
}

fun multiplyMatrices(matrixA: Array<Array<Int>>, matrixB: Array<Array<Int>>): Array<Array<Int>>? {
    val numRowsA = matrixA.size
    val numColsA = matrixA[0].size
    val numRowsB = matrixB.size
    val numColsB = matrixB[0].size

    if (numColsA != numRowsB) {
        println("Невозможно умножить матрицы, так как количество столбцов матрицы A не совпадает с количеством строк матрицы B.")
        return null
    }

    val result = Array(numRowsA) { Array(numColsB) { 0 } }

    for (i in 0 until numRowsA) {
        for (j in 0 until numColsB) {
            for (k in 0 until numColsA) {
                result[i][j] += matrixA[i][k] * matrixB[k][j]
            }
        }
    }

    return result
}

fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val numRows = matrix.size
    val numCols = matrix[0].size

    val transposedMatrix = Array(numCols) { Array(numRows) { 0 } }

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}



fun main() {



}
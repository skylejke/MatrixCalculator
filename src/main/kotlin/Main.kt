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


fun createMatrix(): Array<Array<Int>> {
    print("Количество строк в матрице: ")
    val rows = readln().toInt()
    print("Количество столбцов в матрице: ")
    val cols = readln().toInt()
    val matrix = Array(rows) { Array(cols) { 0 } }

    println("Ввод элементов матрицы")

    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${i + 1}${j + 1} = ")
            matrix[i][j] = readln().toInt()
        }
    }

    return matrix
}


fun printMatrix(matrix: Array<Array<Int>>) {
    for (row in matrix) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
    println()
}

fun matrixCalculator() {
    while (true) {
        println("Выберите операцию")
        println("1 - Сумма матриц\n2 - Вычитание матриц\n3 - Умножение матриц\n4 - Транспонирование матрицы\n0 - Выход")
        try {
            val op = readln().toInt()
            if (op in 0..4) {
                when (op) {
                    1 -> {
                        val matrixA = createMatrix()
                        println("Матрица 1")
                        printMatrix(matrixA)
                        val matrixB = createMatrix()
                        println("Матрица 2")
                        printMatrix(matrixB)
                        println("Результат")
                        sumMatrices(matrixA, matrixB)?.let { printMatrix(it) }
                    }

                    2 -> {
                        val matrixA = createMatrix()
                        println("Матрица 1")
                        printMatrix(matrixA)
                        val matrixB = createMatrix()
                        println("Матрица 2")
                        printMatrix(matrixB)
                        println("Результат")
                        subtractMatrices(matrixA, matrixB)?.let { printMatrix(it) }
                    }

                    3 -> {
                        val matrixA = createMatrix()
                        println("Матрица 1")
                        printMatrix(matrixA)
                        val matrixB = createMatrix()
                        println("Матрица 2")
                        printMatrix(matrixB)
                        println("Результат")
                        multiplyMatrices(matrixA, matrixB)?.let { printMatrix(it) }
                    }

                    4 -> {
                        val matrix = createMatrix()
                        println("Исходная матрицы")
                        printMatrix(matrix)
                        println("Транспонированная матрица")
                        printMatrix(transposeMatrix(matrix))
                    }

                    0 -> {
                        println("Конец работы")
                        return
                    }
                }
            } else {
                println("Пожалуйста, введите число от 0 до 4.")
            }
        } catch (e: NumberFormatException) {
            println("Пожалуйста, введите корректное целое число.")
        }
    }
}

fun main() {

    matrixCalculator()

}
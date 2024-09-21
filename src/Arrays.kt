/*Arrays - Given a two-dimensional array. Calculate the sum of the numbers along the diagonals.*/
fun main() {
    val matrix = arrayOf(
        intArrayOf(15, 4, 7),
        intArrayOf(6, 25, 9),
        intArrayOf(1, 71, 3)
    )

    val primaryDiagonalSum = calculatePrimaryDiagonalSum(matrix)
    val secondaryDiagonalSum = calculateSecondaryDiagonalSum(matrix)

    println("Primary diagonal: $primaryDiagonalSum")
    println("Secondary diagonal: $secondaryDiagonalSum")
}

fun calculatePrimaryDiagonalSum(matrix: Array<IntArray>): Int {
    val size = matrix.size
    var primaryDiagonalSum = 0

    for (i in 0 until size) {
        primaryDiagonalSum += matrix[i][i]
    }

    return primaryDiagonalSum
}

fun calculateSecondaryDiagonalSum(matrix: Array<IntArray>): Int {
    val size = matrix.size
    var secondaryDiagonalSum = 0

    for (i in 0 until size) {
        secondaryDiagonalSum += matrix[i][size - i - 1]
    }

    return secondaryDiagonalSum
}
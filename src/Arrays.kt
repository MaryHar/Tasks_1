import kotlin.math.min

/*Arrays - Given a two-dimensional array. Calculate the sum of the numbers along the diagonals.*/
fun main() {
    val matrix = arrayOf(
        intArrayOf(15, 4, 7),
        intArrayOf(6, 25, 9),
        intArrayOf(1, 71, 3)
    )

    val primaryDiagonalSum = calculateDiagonalSum(matrix, transform = { index, _ ->
        //matrix[index][index]
        index
    }
    )
    val secondaryDiagonalSum = calculateDiagonalSum(matrix, transform = { index, size ->
       // matrix[index][size - 1- index]
        size - index - 1
    })

    println("Primary diagonal: $primaryDiagonalSum")
    println("Secondary diagonal: $secondaryDiagonalSum")

}

fun calculateDiagonalSum(matrix: Array<IntArray>, transform: (Int, Int) -> Int): Int {
    val size = min(matrix.size, matrix.minOf { it.size })
    var primaryDiagonalSum = 0

    for (i in 0 until size) {
        primaryDiagonalSum += transform(i, size)
    }

    return primaryDiagonalSum
}


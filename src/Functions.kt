/*Functions - Create a calculate function that receives two numbers and does operation with the numbers so that we can use the function to sum, subtract, multiply the numbers*/
fun calculate(m: Int, n: Int, operation: String): Int? {
    return when (operation) {
        "add" -> m + n
        "subtract" -> m - n
        "multiply" -> m * n
        else -> null
    }
}

fun main() {
    val addResult = calculate(10, 7, "add")
    val subResult = calculate(10, 7, "subtract")
    val multResult = calculate(10, 7, "multiply")

    println("Addition of numbers: $addResult")
    println("Subtraction of numbers: $subResult")
    println("Multiplication of numbers: $multResult")
}
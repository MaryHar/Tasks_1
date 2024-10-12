package task_1.task_1_1

/*Functions - Create a calculate function that receives two numbers and does operation with the numbers so that we can use the function to sum, subtract, multiply the numbers*/
/*fun calculate(m: Int, n: Int, operation: String): Int? {
    return when (operation) {
        "add" -> m + n
        "subtract" -> m - n
        "multiply" -> m * n
        else -> null
    }
}*/
fun calculate(num1: Double, num2: Double, operationLambda: (Double, Double) -> Double): Double {
        return operationLambda(num1, num2)
    }


fun main() {

    val add: (Double, Double) -> Double = { x, y -> x + y }
    val subtract: (Double, Double) -> Double = { x, y -> x - y }
    val multiply: (Double, Double) -> Double = { x, y -> x * y }

    val addRes = calculate(5.0, 3.0, add)
    val subRes = calculate(5.0, 3.0, subtract)
    val multiplyRes = calculate(5.0, 3.0, multiply)

    println("Addition: $addRes")
    println("Subtract: $subRes")
    println("Multiplication: $multiplyRes")


    /* val addResult = calculate(10, 7, "add")
     val subResult = calculate(10, 7, "subtract")
     val multResult = calculate(10, 7, "multiply")

     println("Addition of numbers: $addResult")
     println("Subtraction of numbers: $subResult")
     println("Multiplication of numbers: $multResult")*/
}
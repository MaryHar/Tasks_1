fun findFibonacci(n: Long): Long {
    if (n <= 1) {
        return n
    } else {
        return findFibonacci(n - 1) + findFibonacci(n - 2)
    }
}

fun main() {
    val n = 50
    val nthFibonacci = findFibonacci(n.toLong())
    println("The $n-th Fibonacci number is: $nthFibonacci")
}
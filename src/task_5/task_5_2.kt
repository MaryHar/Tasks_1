fun longest(MyString: String): Int {
    var maxLength = 0
    var startIndex = 0
    val unique = mutableSetOf<Char>()

    for (curIndex in MyString.indices) {
        while (MyString[curIndex] in unique) {
            unique.remove(MyString[startIndex])
            startIndex++
        }
        unique.add(MyString[curIndex])
        maxLength = maxOf(maxLength, curIndex - startIndex + 1)
    }
    return maxLength
}

fun main() {
    val input1 = "12312322"
    val input2 = "5555"
    val result1 = longest(input1)
    val result2 = longest(input2)
    println("Input: s = \"$input1\"")
    println("Output: result = $result1\"")
    println("Input: s = \"$input2\"")
    println("Output: result = $result2")

}

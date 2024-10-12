fun function (input: String): Int {
    val characterIndices = mutableMapOf<Char, Int>()
    var longestPath = -1

    for (index in input.indices) {
        val currentCharacter = input[index]
        val previousIndex = characterIndices[currentCharacter]

        if (previousIndex != null) {
            val pathLength = index - previousIndex
            longestPath = maxOf(longestPath, pathLength)
        }

        characterIndices[currentCharacter] = index
    }

    return longestPath
}

fun main() {
    val inputString = "abcdef"
    val longestPath = function(inputString)
    println("Result: $longestPath")
}
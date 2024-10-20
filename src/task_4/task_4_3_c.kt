fun function (input: String): Int {
    val characterIndices = mutableMapOf<Char, Int>()
    var longestPath = -1

    for (index in input.indices) {
        val currentCharacter = input[index]
        val previousIndex = characterIndices[currentCharacter]

        if (previousIndex != null) {
            val pathLength = index - previousIndex - 1
            longestPath = maxOf(longestPath, pathLength)
        } else {
            characterIndices[currentCharacter] = index
        }
    }
        return longestPath
    }

    fun main() {
        val inputString = "abqcdefbghqigf"
        val longestPath = function(inputString)
        println("Result: $longestPath")
    }

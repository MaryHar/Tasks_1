package task_4

fun <T : Comparable<T>> mergeArrays(arr1: List<T>, arr2: List<T>): List<T> {
    val mergedArray = mutableListOf<T>()
    var i = 0
    var j = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] <= arr2[j]) {
            mergedArray.add(arr1[i])
            i++
        } else {
            mergedArray.add(arr2[j])
            j++
        }
    }

    mergedArray.addAll(arr1.subList(i, arr1.size))
    mergedArray.addAll(arr2.subList(j, arr2.size))

    return mergedArray
}

fun main() {
    val arr1 = listOf(1, 3, 5, 7, 10, 24)
    val arr2 = listOf(2, 4, 6, 8, 12)
    val merged = mergeArrays(arr1, arr2)
    println(merged)
}
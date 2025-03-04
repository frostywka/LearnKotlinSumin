package kotlinForProfi

fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив ${array.contentToString()}")
    reverseINT(array)
    println("Перевернутый массив ${array.contentToString()}")

    println("----------------")

    val charArray = "HELLO".toCharArray()
    println("Исходный массив ${charArray.contentToString()}")
    reverseChar(charArray)
    println("Перевернутый массив ${charArray.contentToString()}")
}

fun reverseINT(arr: IntArray) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }
}

//fun reverseSTRING(arr: Array<String>)

fun reverseChar(arr: CharArray) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }
}

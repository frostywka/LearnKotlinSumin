package kotlinForProfi

import kotlinForProfi.Part3.array

fun main() {
//    println("Котлин использует только 1 тип - Ссылочный," +
//            " НО Компилятора Колин может используется примитивный, так как он быстрей в Java Байт коде ")
    val array = intArrayOf(1, 2, 3, 4, 5)
    println("Исходный массив: ${array.contentToString()}")

    println("Исходный массив: ${array.joinToString(", ")}")
    reverseArrayInPlace(array)
    println("Развернутый массив: ${array.joinToString(", ")}")
    println("Исходный массив: ${array.contentToString()}")

}

fun reverseArrayInPlace(arr: IntArray) {
    var start = 0
    var end = arr.size - 1

    while (start < end) {
        // Меняем местами элементы
        val temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        // Сдвигаем указатели
        start++
        end--
    }
}

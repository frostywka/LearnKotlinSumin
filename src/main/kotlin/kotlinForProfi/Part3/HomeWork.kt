package kotlinForProfi.Part3
// провести эксперименты
//1 in 1..3
//  (1..3).toList()
//  1 in 3 downTo 1
//  1 in 1 until 3
//  3 in 1 until 3
//  2 in 1..3
//  2 !in 1..3
//  'x' in 'a'..'z'

// Имеет функции downTo - создает интервал с убывающими значениями
// until - создает интервал не включающий верхнюю границу выбранного диапазона

fun main() {
    println("__array__")
    array()
    println("__downTo__")
    downTo()
    println("__until__")
    until()
    println("____")
}

fun array() {
    val array = arrayOf(1,2,3,4,5)
    val list = array.toList()
    println(list)
    val secondValue = list[2]
    println(secondValue)
}

fun downTo() {
    for (i in 5 downTo 1)
        println(i)
}

fun until() {
    for (i in 1 until 5) {
        println(i)
    }
}

package kotlinInAction.`2_3_Perechislenie_When`

//import java.awt.Color as JavaColor
import java.awt.Color.*


fun main() {
    println(toWhen(Color.BLUE))
    println(toManyWhen(Color.ORANGE))
    println("_________")
    println(mix(BLUE, YELLOW))
    println("_________")
    println(fixOptimized(Color.RED, Color.YELLOW))
}

fun toWhen(color: Color) = when (color) {
    Color.RED -> "Каждый"
    Color.ORANGE -> "Охотник"
    Color.YELLOW -> "Желает"
    Color.GREEN -> "Знать"
    Color.BLUE -> "Где"
    Color.INDIGO -> "Сидит"
    Color.VIOLET -> "Фазан"
    else -> "Нет такого цвета"
// else -> throw IllegalStateException("Unknown color") // если реально нет такого цвета , не будет компилироваться
// else - {} - выдает unit(any)
// else - "" - выдаст пустую строку
}

// объединение операторов в одну ветку
fun toManyWhen(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "Теплый"
    Color.GREEN -> "Нейтральный"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "Холодный"
    else -> "Нет такого описания"
}

// стр54
// Использование оператора When с произвольными объектами
fun mix(c1: java.awt.Color, c2: java.awt.Color) = when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> "ORANGE"
    setOf(YELLOW, BLUE) -> "GREEN $GREEN" // GREEN
    else -> throw Exception("Грязный цвет")

//    fun mix(c1: JavaColor, c2: java.awt.Color) = when (setOf(c1, c2)) {
//    setOf(JavaColor.JavaColor.RED, JavaColor.YELLOW) -> "ORANGE"
//    setOf(JavaColor.YELLOW, JavaColor.BLUE) -> "GREEN" // GREEN
//    else -> throw Exception("Грязный цвет")
}
//  &&: логическое "И" — результат true, если оба условия истинны.
//  ||: логическое "ИЛИ" — результат true, если хотя бы одно условие истинно.

// Выражение When без Аргумента
fun fixOptimized(a1: Color, a2: Color) = when {
    (a1 == Color.RED && a2 == Color.YELLOW) ||
            (a1 == Color.YELLOW && a2 == Color.RED) -> Color.ORANGE
    else -> throw Exception("Duty Color")
}
//fun fixOptimized(a1: java.awt.Color, a2: java.awt.Color) = when {
//    (a1 == RED && a2 == YELLOW) ||
//            (a1 == YELLOW && a2 == RED) -> "ORANGE"
//    else -> throw Exception("Duty Color")
//}



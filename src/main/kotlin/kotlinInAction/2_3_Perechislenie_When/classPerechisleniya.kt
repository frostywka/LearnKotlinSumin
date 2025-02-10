package kotlinInAction.`2_3_Perechislenie_When`

// Класс Перечислений
// enum - мягкое ключевое слово

//enum class Color  {
//    RED, ORANGE, yellow, green, blue, indigo, violet
//}

// Объявление класса перечисления со свойствами

enum class Color(
    val r: Int, val g: Int, val b: Int
) {
    RED(255, 0, 0), ORANGE(255, 165, 0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75,0,130),VIOLET(238,130,238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(Color.BLUE.rgb())
}
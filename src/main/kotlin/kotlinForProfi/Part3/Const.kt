package kotlinForProfi.Part3

// Объявление константы времени компиляции
//В Kotlin принято использовать верблюжийРегистр camelCase для имен переменных
// и ЗМЕИНЫЙ РЕГИСТР SNAKE_CASE для имен констант,
// Таким образом вместо того чтобы присваивать новой константе имя heroName правильнее было бы назвать ее HERO_NAME,

const val HERO_NAME: String = "KtoToTam"

fun main() {
    val player = "Hokogami"
    println(HERO_NAME)
    println(player.length)
    println(player[4])
    println(player.get(4))
    println(player.subSequence(0,4))
    println(player.subSequence(4,8))
    println(player.reversed())
}


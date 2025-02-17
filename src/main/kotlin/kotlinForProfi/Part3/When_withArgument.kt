package kotlinForProfi.Part3

fun main() {
    println("___whenTo___")
    whenWithArgument()
    println("___whenWithArgumentRefactoring___")
    whenWithArgumentRefactoring()
    println("_____")
}

fun whenWithArgument() {
    val totalExperience = 115
    val playerLevel: Int = totalExperience / 100 + 1 // Тут объявляем как высчитывается левл
    val playerTitle: String = when (playerLevel) {   // Тут Оператор when показывает соответствие левла - рангу
        1 -> "Ученик"
        in 2..8 -> "Уровень Война $playerLevel "
        9 -> "Победитель"
        else -> "Заслуженный рыцарь"
    }
    println(playerTitle)
}

fun whenWithArgumentRefactoring() {
    val totalExperience = 123
    val playerTitle = when (val playerLevel = totalExperience / 100 + 1) { // перенос объявления переменной в аргумент выражения when
        1 -> "Ученик"
        in 2..8 -> "Уровень Война $playerLevel "
        9 -> "Победитель"
        else -> "Заслуженный рыцарь"
    }
    println(playerTitle)
}

package kotlinForProfi.Part4

fun main() {
    println("___newFunction___")
    newFunction()
    println("___readBountyBoard___")
    readBountyBoard()
}

private const val HERO_NAME: String = "MawashaGuru"
var playerLevel = 4

fun newFunction() {
    println(HERO_NAME)
    println(playerLevel)

    readBountyBoard()
//    obtainQuestSecond(1,"lolodin")
    playerLevel += 1
    println(playerLevel)
    readBountyBoard()
}

// Здесь вызываем функцию , в которой дергается функция из другого файла(класса) + передаем в ней нужные нам параметры
private fun readBountyBoard() {
    println(obtainQuest(playerLevel, "paladin"))
}

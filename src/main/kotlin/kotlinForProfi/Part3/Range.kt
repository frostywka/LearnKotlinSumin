package kotlinForProfi.Part3

// Сам оператор обозначается ".."
// Имеет функции downTo - создает интервал с убывающими значениями
// until - создает интервал не включающий верхнюю границу выбранного диапазона
//

fun main() {
    range()

}
    fun range() {
        println(NAME_HERO)
        var playerLevel = 3
        println(playerLevel)

        val hasBeFriendBarbarians = true
        val hasAngeredBarbarians = false
        val classPlayer = "paladin"
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
        val quest: String = if (playerLevel == 1) {
            "Слишком дохлый, чтобы сражаться на этом уровне"
//        } else if (playerLevel <= 5) {//  поменяем на <= на range
        } else if ( playerLevel in 2..5) {
            if (canTalkToBarbarians) {
                "Так как мы дружим с варварами, мы их просим освободить город"
            } else {
                " Тут мы не дружим с варварами. Зачистить город от варваров"
            }
        } else if (playerLevel <= 6) {
            " идем на квест 6ого левла или меньше"
        } else if (playerLevel == 7) {
            " мы идем на квест 7ого левла"
        } else {
            "Можешь пройти на высокий уровень сложности"
        }
        println(quest)

        playerLevel += 1
        println(playerLevel)
    }



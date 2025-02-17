package kotlinForProfi.Part3

fun main() {
    println("___whenTo___")
    whenTo()
    println("___whenToQuest___")
    whenToQuest()
    println("_____")

}

fun whenTo() {
    val race = "gnome"
    val faction: String = when (race) {
        "dwarf" -> "Хранители шахт"
        "gnome" -> "Изобретатели подземелья"
        "orc", "human" -> "Свободные люди холмов"
        else -> "неизвестная раса"
    }
    println(faction)
}

fun whenToQuest() {
    println(NAME_HERO)
    var playerLevel = 3
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"
    val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
//    val quest: String = if (playerLevel == 1) { // меняем IF на when
    val quest: String = when (playerLevel) {
        1 -> "Слишком дохлый, чтобы сражаться на этом уровне"
//     } else if ( playerLevel in 2..5) {
        in 2..5 -> {
            if (canTalkToBarbarians) {
                "Так как мы дружим с варварами, мы их просим освободить город"
            } else {
                " Тут мы не дружим с варварами. Зачистить город от варваров"
            }
        }
//    } else if (playerLevel <= 6) {
        6 -> "Идем на квест 6ого левла "
//    } else if (playerLevel == 7) {
        7 -> "мы идем на квест 7ого левла"
        else -> "Можешь пройти на высокий уровень сложности"
    }
    println(quest)

    playerLevel += 1
    println(playerLevel)
}
package kotlinForProfi.Part4

import kotlinForProfi.Part3.NAME_HERO

fun main() {
    whenTo()
    println("________obtainQuest______")
    println(obtainQuest(3,"paladin"))
    println("________obtainQuestSecond______")
    println(obtainQuestSecond(4))
    println("________printObtainQuestSecond______")
    printObtainQuestSecond()
}

fun whenTo() {
    println(NAME_HERO)
    var playerLevel = 3
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"
//val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
//    val quest: String = if (playerLevel == 1) { // меняем IF на when
    val quest: String = obtainQuest(playerLevel, classPlayer, hasAngeredBarbarians, hasBeFriendBarbarians)
    println(quest)

    playerLevel += 1
    println(playerLevel)
}

fun obtainQuest(
    playerLevel: Int,
    classPlayer: String,
    hasAngeredBarbarians: Boolean = false, // дефолтное значение через "="
    hasBeFriendBarbarians: Boolean = false
): String {
    val quest: String = when (playerLevel) {
        1 -> "Слишком дохлый, чтобы сражаться на этом уровне"
        in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
            if (canTalkToBarbarians) {
                "Так как мы дружим с варварами, мы их просим освободить город"
            } else {
                " Тут мы не дружим с варварами. Зачистить город от варваров"
            }
        }

        6 -> "Идем на квест 6ого левла "
        7 -> "мы идем на квест 7ого левла"
        else -> "Можешь пройти на высокий уровень сложности"
    }
    return quest
}

fun obtainQuestSecond(
    playerLevel: Int,
    classPlayer: String = "lolodin", // дефолтное значение через "="
    hasAngeredBarbarians: Boolean = false, // дефолтное значение через "="
    hasBeFriendBarbarians: Boolean = false // дефолтное значение через "="
): String = when (playerLevel) {
    1 -> "Слишком дохлый, чтобы сражаться на этом уровне"
    in 2..5 -> {
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
        if (canTalkToBarbarians) {
            "Так как мы дружим с варварами, мы их просим освободить город"
        } else {
            " Тут мы не дружим с варварами. Зачистить город от варваров"
        }
    }

    6 -> "Идем на квест 6ого левла "
    7 -> "мы идем на квест 7ого левла"
    else -> "Можешь пройти на высокий уровень сложности"
}


fun printObtainQuestSecond() {
    println(obtainQuestSecond(2, "lolodin"))
}

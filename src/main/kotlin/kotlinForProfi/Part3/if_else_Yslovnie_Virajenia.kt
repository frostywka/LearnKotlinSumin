package kotlinForProfi.Part3


fun main() {
    canTalk2()
    println("__________")
    refactoringCatTalk()
    println("_____addQuestInIneVAL_____")
    addQuestInIneVAL()
    println("__________")
    mama()
}

fun canTalk2() {
    println(NAME_HERO)
    var playerLevel = 4
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"
    val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
    val barbarianQuest = if (canTalkToBarbarians) {
        "Так как мы дружим с варварами, мы их просим освободить город"
    } else {
        "Тут мы не дружим с варварами. Зачистить город от варваров"
    }


    if (playerLevel == 1) {
        println("Слишком дохлый, чтобы сражаться на этом уровне")
    } else if (playerLevel <= 5) {
        println(barbarianQuest)
    } else if (playerLevel <= 6) {
        println(" меньше или равен 6")
    } else {
        println(" Можешь пройти на высокий уровень сложности")
    }
    playerLevel += 1
    println(playerLevel)
}

fun refactoringCatTalk() {
    println(NAME_HERO)
    var playerLevel = 7
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"
    val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
    val barbarianQuest = if (canTalkToBarbarians) {
        "Так как мы дружим с варварами, мы их просим освободить город"
    } else {
        "Тут мы не дружим с варварами. Зачистить город от варваров"
    }
    val allLevelUps: String = if (playerLevel <= 6) {
        " Ты можешь пойти на 6ой уровень сложности"
    } else {
        " Можешь пройти на высокий уровень сложности"
    }


    if (playerLevel == 1) {
        println("Слишком дохлый, чтобы сражаться на этом уровне")
    } else if (playerLevel <= 5) {
        println(barbarianQuest)
    } else if (playerLevel <= 6) {
        println(allLevelUps)
    } else {
        println("Можешь пройти на высокий уровень сложности")

        playerLevel += 1
        println(playerLevel)
    }
}

fun addQuestInIneVAL() {
    println(NAME_HERO)
    var playerLevel = 7
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"
    val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")
    val quest: String = if (playerLevel == 1) {
        "Слишком дохлый, чтобы сражаться на этом уровне"
    } else if (playerLevel <= 5) {
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

fun mama(){
    var playerNooo: Int
//    println(playerNooo) должен быть инициализирован, иначе не соберется
    println("asdasda")
    println(HERO_NAME)
    playerNooo = 5
    println(playerNooo)
}
package kotlinForProfi.Part3

const val NAME_HERO = "Naruto"

fun main() {
    game()
    println("_________")
    friendsInGame()
    println("_________")
    canTalk()
}

fun game() {
    println(NAME_HERO)
    var playerLevel = 5
    println(playerLevel)

    if (playerLevel == 1) {
        println("Слишком дохлый, чтобы сражаться на этом уровне")
    } else if (playerLevel <= 5) {
        println(" ты все еще тряпка ! меньше или равен 5")
    } else if (playerLevel <= 6) {
        println(" меньше или равен 6")
    } else if (playerLevel <= 7) {
        println(" меньше или равен 7")
    } else if (playerLevel <= 8) {
        println(" меньше или равен 8")
    } else {
        println(" Можешь пройти на высокий уровень сложности")
    }
    playerLevel += 1
    println(playerLevel)
}

fun friendsInGame() {
    println(NAME_HERO)
    var playerLevel = 4
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"

    if (playerLevel == 1) {
        println("Слишком дохлый, чтобы сражаться на этом уровне")
    } else if (playerLevel <= 5) {
//        if (hasBeFriendBarbarians == true) { // дополнительное условие
        if (!hasAngeredBarbarians && hasBeFriendBarbarians || classPlayer == "barbarian") {
            println("Так как мы дружим с варварами, мы их просим освободить город")
        } else {
            println(" Тут мы не дружим с варварами. Зачистить город от варваров")
        }
    } else if (playerLevel <= 6) {
        println(" меньше или равен 6")
    } else if (playerLevel <= 7) {
        println(" меньше или равен 7")
    } else if (playerLevel <= 8) {
        println(" меньше или равен 8")
    } else {
        println(" Можешь пройти на высокий уровень сложности")
    }
    playerLevel += 1
    println(playerLevel)
}

fun canTalk() {
    println(NAME_HERO)
    var playerLevel = 4
    println(playerLevel)

    val hasBeFriendBarbarians = true
    val hasAngeredBarbarians = false
    val classPlayer = "paladin"
    val canTalkToBarbarians = !hasAngeredBarbarians && (hasBeFriendBarbarians || classPlayer == "barbarian")

    if (playerLevel == 1) {
        println("Слишком дохлый, чтобы сражаться на этом уровне")
    } else if (playerLevel <= 5) {
        if (canTalkToBarbarians) {
            println("Так как мы дружим с варварами, мы их просим освободить город")
        } else {
            println(" Тут мы не дружим с варварами. Зачистить город от варваров")
        }
    } else if (playerLevel <= 6) {
        println(" меньше или равен 6")
    } else {
        println(" Можешь пройти на высокий уровень сложности")
    }
    playerLevel += 1
    println(playerLevel)
}
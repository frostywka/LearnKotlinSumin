package kotlinForProfi.Part3

fun main() {
    println("___whenWithoutArgument___")
    whenWithoutArgument()
//    println("___whenWithArgumentRefactoring___")
//    whenWithArgumentRefactoring()
//    println("_____")
}

fun whenWithoutArgument() {
    val experiencePoints = 20
    val requiredExperiencePoints = 30

    val levelUpStatus: String = when {
        experiencePoints > requiredExperiencePoints -> "Уровень уже поднят"
        experiencePoints == requiredExperiencePoints -> "Достаточно опыта для повышения уровня"
        requiredExperiencePoints - experiencePoints < 20 -> "Ты очень близок к повышению уровня"

        else -> "Тебе нужно больше опыта для ЛевелАпа"
    }
    println(levelUpStatus)
}
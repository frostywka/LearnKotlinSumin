package suminKotlinFastRun

fun main() {
//    Переменная типа VAR может изменятся
//    Переменная типа VAL не может изменятся
//    Рекоммендуется использовать переменную VAL аналог final в Java

    var name2: String = "ILYA" // Стринг можно не указывать так и так понятно что типо стринг
//    var name2 = "bob" // Будет ошибка потому что значение изменилось
    val name = "Ivan"
    var age: Int = 26
    val bool: Boolean = true
    val bool2 = false
//    Нет примитивных типов, все типы Ссылочные. обычные классы
    println("Результат = $name $name2 $age $bool $bool2")

    println("_______")

    forExp()
}

fun forExp() {
    var playerLevel: Int = 4
    println(playerLevel)
    playerLevel += 1
    println(playerLevel)
    playerLevel ++
    println(playerLevel)
    playerLevel --
    println(playerLevel)
    playerLevel -= 1
    println(playerLevel)
    playerLevel *= 2
    println(playerLevel)
    playerLevel /= 2
    println(playerLevel)

// String &строка(
//Текстовая информация
//"Madrigal" "happy meal"
//Char &символ(
//Один символ
//'X'
//Символ Юникод U+0041
//Boolean &логиче, ский(
//Истина.ложь Да.Нет
//true false
//Int &целочисленный(
//Целое число
//5 "Madrigal".length
//Double &с плаваю, —ей запятой(
//Дробные числа
//3.14 2.718

//List &список(
//Коллекция элементов
//3, 1, 2, 4, 3
//"root beer", "сlub soda", "coke"

//Set множество
//Коллекция уникальных значений
//"Larry", "Moe", "Curly", "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

//Map ассоциативный массив(
//Коллекция пар |ключ » значение–
//"small" to 5.99, "medium" to 7.99, "large" to 10.99

}
package suminKotlinFastRun

fun main() {
    println("Hello World" + " ")

//    Переменная типа VAR может изменятся
//    Переменная типа VAL не может изменятся
//    Рекоммендуется использовать переменную VAL аналог final в Java

    var name2: String = "ILYA" // Стринг можно не указывать так и так понятно что типо стринг
//    var name2 = "bob" // Будет ошибка потому что значение изменилось
    val name = "Ivan"
    var age: Int = 26
//    Нет примитивных типов, все типы Ссылочные. обычные классы
    println(name + name2 + age)

}
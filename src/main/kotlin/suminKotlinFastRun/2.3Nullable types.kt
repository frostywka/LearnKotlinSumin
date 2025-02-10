package suminKotlinFastRun

//Есть какая то переменная с типом стринг - в ней обязательно должна быть какая то строка
// В примере переменная a имеет тип СТРОКА , но значение null
//private var a: String = null - программа просто не соберется

// Явное указание, что переменная МОЖЕТ быть NULL - это добавление после Типа данной значка "?"
private var b: String? = null
private var c: String? = null
private var d: String? = null
private var e: String? = "POE2"

private var name: String? = "asdasd"
private var name2: String? = "asdasd"

private var one: String? = null
private var two: String? = null
private var three: String? = null

fun main() {


    println("_______________")
//    println(b.length) // Чтобы компилятор собрал, нужно использовать 2 способа:
//    1) не безопасный (я уверен, что переменная не NULL) - это добавление При вызове 2 символа "!!"
//    println(b!!.length)

//    2) безопасный добавление ? эквивалента проверки на NULL.
//    Если переменная равна null, то и все выражение будет равно null, если не равен, вызывается какой то метод
//    Вызвать переменную без "?" - нельзя , не соберется
    println("Вызываем переменную b через '?' , то есть println(b?.length) = ${b?.length}")
    println(b?.length) // запись эквивалент проверки на null
    println("переменная b = $b")
    println("_______________")

// Если значение C?.length не равно Null, можно привести к типу стринг через .toString()

    val length1: String? = c?.length?.toString()
    val length: String? = name?.length?.toString()
    
    println("Переменная length1 = ${length1?.length}")
    println("Переменная length = ${length?.length}")
    println("Переменная length3 = ${name2?.length}")

    println("_______________")
//    Если мы не хотим получать Null, то через ":" можно указать, что выводить если левая часть null
//        ?: - это оператор Элвис
    val length2 = d?.length ?: 0
    println("переменная d = ${d?.length}")
    println("d = $length2")


    println("_______________")

    // если e реально строка , то выводим кол-во символов в строке
    val length3 = e?.length ?: 0
    println("e = " + length3)

    println("_______________")
//    У вас есть 3 nullable строки! нужно в переменную result сохранить сумму длин всех строк
//    и вывести на экран, если длина строки null, то вместо ее длины используйте 0.
//    нул и число сложить нельзя

    println("_______________")

    homeWorkByTeacher()
// сделано преподом
    println("_______________")

}


fun homeWorkByTeacher() {
    val a: String? = null
    val b: String? = "123123"
    val c: String? = ""
    val result = (a?.length ?: 0) + (b?.length ?: 0) + (c?.length ?: 0)
    println("Решение преподавателя = $result")

}


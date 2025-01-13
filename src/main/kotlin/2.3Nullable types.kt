import org.w3c.dom.Text

//private var a: String = null

//Есть есть какая то переменная с типом стринг - в ней обязательно должна быть какая то строка
//переменная a

//А что если вам нужно для переменной NULL, то после типа данных поставить ?
//объект становится нулабельным, как только добавляется знак вопроса после указания типа ?
private var b: String? = null
private var c: String? = null
private var d: String? = null
private var e: String? = "POE2"

private var one: String? = null
private var two: String? = null
private var three: String? = null

fun main() {
//    println(a.length) // программа просто не соберется
//    println(b.length) // Чтобы компилятор собрал, нужно использовать 2 способа:
//    1) не безопасный (я уверен, что переменная не NULL
//    println(b!!.length)

//    2) безопасный добавление ? эквивалентно проверки на NULL.
//    Если переменная равна null, то и все выражение будет равно null, если не равен, вызывается какой то метод
    println(b?.length)

// Если значение C?.length не равно Null, можно привести к типу стринг через .toString()
    val length = c?.length?.toString()
    println(c?.length)

//    Если мы не хотим получать Null, то через : можно указать, что выводить если левая часть null
//        ?: - это оператор Элвис
    val length2 = d?.length ?: 0
    println("d = " + d?.length)
    println("d = " + length2)

    // если e реально строка , то выводим кол-во символов в строке
    val length3 = e?.length ?: 0
    println("e = " + length3)


    homeWork1()
//    У вас есть 3 nullable строки! нужно в переменную result сохранить сумму длин всех строк
//    и вывести на экран, если длина строки null, то вместо ее длины используйте 0.
//    нул и число сложить нельзя


homeWorkByTeacher()
// сделано преподом
}

fun homeWork1() {
    // неправильно понял условие - Вся задача неверная
    var result: Int? = null
    val lengthOne = one?.length?.toString() ?:0
    val lengthTwo = two?.length?.toInt()?:0
    val lengthThree = three?.length?.toInt() ?:0

    println("what is one = " + one)
    println("what is two = " + two)
    println("what is three = " + three)
    println("result = " + lengthOne + lengthTwo + lengthThree)
}

fun homeWorkByTeacher(){
    val a: String? = null
    val b: String? = "123123"
    val c: String? = ""
    val result = (a?.length?:0) + (b?.length?:0) + (c?.length?:0)
    println("Решение преподавателя = " + result)

}


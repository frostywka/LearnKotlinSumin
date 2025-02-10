package kotlinInAction
//PS "a else b". Вернуть а, если а>b, иначе вернуть b
fun main() {
    println("Функция с block-body $(max(1, 2))")
    println("____________")
    println("Функция с expression-body $(neMax(1,2))")
}

// block-body когда ЕСТЬ фигурных скобок и оператора return
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}
// expression-body когда НЕТ фигурных скобок и оператора return
fun neMax(a: Int, b: Int) = if (a > b) a else b




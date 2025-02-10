package kotlinInAction.`2_3_Perechislenie_When`

fun main() {
    println(evalS(Sum(Sum(Num(2), Num(3)), Num(5))))
    println(evalSS(Sum(Sum(Num(3), Num(4)), Num(6))))
}

fun evalS(e: Expr): Int =
    if (e is Num) {
        e.value // У входного параметра "e" типа Expr проверяем соответствие типу Num.
    // В Случае соответствия, возвращаем из функции значение поле value - Num.value
    } else if (e is Sum) {
        evalS(e.right) + evalS(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

fun evalSS(e: Expr): Int =
    when (e) {
        is Num ->  // Ветка when проверяет тип арrумента
            e.value  // Используется автоматическое приведение типов
        is Sum ->
            evalSS(e.right) + evalSS(e.left) // Используется автоматическое приведение типов
        else ->
            throw IllegalArgumentException("Unknown expression")
    }
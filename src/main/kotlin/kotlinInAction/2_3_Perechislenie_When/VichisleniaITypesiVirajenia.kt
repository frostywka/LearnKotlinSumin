package kotlinInAction.`2_3_Perechislenie_When`

// Иерархия классов для предоставления выражений
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// В Kotlin принадлежность переменной к определенному типу проверяется с помощью оператора "is"
// Явное приведение к конкретному типу выражается с помощью ключевого слова "as"
//val n = е as Num
fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}

fun eval(e: Expr): Int {
    if (e is Num) {
        return e.value
//        val n = e as Num
//        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown")
}
package kotlinInAction.`2_3_Perechislenie_When`

// Блоки в выражениях <<if>> и <<when>>

fun main() {
    println(evalWithLogging(Sum(Sum(Num(3), Num(4)), Num(6))))

}

fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = evalWithLogging(e.left)
            val right = evalWithLogging(e.right)
            println("sun: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("UNKNOWN")
    }
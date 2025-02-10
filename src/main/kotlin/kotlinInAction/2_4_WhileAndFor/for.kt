package kotlinInAction.`2_4_WhileAndFor`

// Итерации по поспедоватепьности чисел:
//диапазоны и проrрессии

fun main() {
    for (i in 1..100)
        println(fizzBuzz(i))
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}


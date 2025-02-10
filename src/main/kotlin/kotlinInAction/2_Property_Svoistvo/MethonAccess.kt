package kotlinInAction.`2_Property_Svoistvo`

// Собственный метод к свойству
// Но вообще, характеристика (свойство) класса должна, быть объявлена свойством.

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
//            return height == width
}

fun main() {
    val rectangle = Rectangle(43, 43)
    println(rectangle.isSquare)
}

// Красиво . но длинно
//fun test() {
//    val rectangle = Rectangle(41, 43)
//    println(rectangle.isSquare)
//}


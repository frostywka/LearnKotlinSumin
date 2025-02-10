package kotlinInAction.`2_Property_Svoistvo`
//Свойство, объявленное какval, доступно только для чтения,а свойство var можно изменять.

// Пример Конструктора на JAVA
///* Java */
//>>> Person person = new Person("ВоB, true);
//>>> System.out.println(person.getName());
//ВоЬ
//>>> System.out.println(person.isMarried());
//true

// В классе объявлен Конструктор
class Person(
    val name: String,
    var isMarried: Boolean
)

fun main() {
    person()
    println("________")

}

// Объявляешь переменную со значением Person("Bob", true)
fun person(){
    val person = Person("Bob", true)
    println(person.name)
    println(person.isMarried)
}


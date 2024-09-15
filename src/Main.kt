val pregunta = "te gusta desarrollar app ?"

val respuesta = 43
val numbers = mutableListOf("one", "two", "three", "four")

var numbers2 = mutableListOf("one", "two", "three", "four") // El mismo resultado, usando declaración var


// [one, two, three, four, five]
fun main() {
    println("Hello World!")
    numbers.add("five")   // this is OK
    println(numbers)
    numbers2.add("five")   // this is OK
    println(numbers)
}
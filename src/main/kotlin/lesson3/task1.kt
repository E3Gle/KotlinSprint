package lesson3

fun main() {
    val isAfternoon = false
    val userName = "Claire"
    val greetingMessage: String

    if (isAfternoon) {
        greetingMessage = "Good day to you, $userName"
        println(greetingMessage)
    } else {
        greetingMessage = "Good evening to you, $userName"
        println(greetingMessage)
    }
}
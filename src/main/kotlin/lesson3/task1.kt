package lesson3

fun main() {
    val beforeNoonGreeting = "Good day to you, "
    val afterNoonGreeting = "Good evening to you, "
    val userName = "Vasya"

    var greetingMessage = "$beforeNoonGreeting$userName"
    println(greetingMessage)

    greetingMessage = "$afterNoonGreeting$userName"
    println(greetingMessage)
}
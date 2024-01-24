package lesson3

fun main() {
    greeting(true)
    greeting(false)
}

fun greeting(isAfternoon: Boolean) {
    val beforeNoonGreeting = "Good day to you, "
    val afterNoonGreeting = "Good evening to you, "
    val userName = "Vasya"
    val greetingMessage: String
    if (isAfternoon) {
        greetingMessage = "$beforeNoonGreeting$userName"
        println(greetingMessage)
    } else {
        greetingMessage = "$afterNoonGreeting$userName"
        println(greetingMessage)
    }
}
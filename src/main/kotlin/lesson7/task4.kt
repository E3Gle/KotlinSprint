package lesson7

fun main() {
    println("Укажите сколько секунд вы хотите засечь: ")
    val userInput = readln().toInt()
    val secondsToCount = 1..userInput

    for (s in secondsToCount.reversed()) {
        println("Секунд осталось: $s")
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }
    println("Время вышло")
}

const val MILLISECONDS_IN_SECOND = 1000L
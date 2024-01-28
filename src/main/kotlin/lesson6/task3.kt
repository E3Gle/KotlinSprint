package lesson6

fun main() {
    println("Укажите какое количество секунд необходимо засечь: ")
    var userSecondsInput = readln().toInt()

    while (userSecondsInput > 0) {
        println("Осталось секунд: $userSecondsInput")
        userSecondsInput--
        Thread.sleep(MILLISECONDS_IN_SECOND)
    }
    println("Время вышло")
}

const val MILLISECONDS_IN_SECOND = 1000L
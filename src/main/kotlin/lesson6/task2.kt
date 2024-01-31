package lesson6

fun main() {
    println("Укажите какое количество секунд необходимо засечь: ")
    val userSecondsInput = readln().toInt()

    Thread.sleep(userSecondsInput * MILLISECONDS_IN_SECOND)
    println("Прошло $userSecondsInput секунд.")
}
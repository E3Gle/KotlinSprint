package lesson6

fun main() {
    var attemptsCounter = 5
    val targetNumber = (0..9).random()

    println("Вам предстоит угадать число от 0 до 9. У вас есть 5 попыток.")

    do {
        println("Введите число: ")
        when (readln().toInt()) {
            targetNumber -> {
                println("Это была великолепная игра!")
                break
            }

            else -> println("Неверно. Осталось попыток: ${--attemptsCounter}")
        }
    } while (attemptsCounter > 0)

    if (attemptsCounter == 0) println("Было загадано число: $targetNumber")
}
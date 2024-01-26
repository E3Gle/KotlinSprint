package lesson6

import kotlin.random.Random

fun main() {
    var attemptsCounter = 5
    val targetNumber = Random.nextInt(10)

    println("Вам предстоит угадать число от 0 до 9. У вас есть 5 попыток.")

    while (attemptsCounter > 0) {
        println("Введите число: ")
        when (readln().toInt()) {
            targetNumber -> {
                println("Это была великолепная игра!")
                break
            }
            else -> println("Неверно. Осталось попыток: ${--attemptsCounter}")
        }
    }

    if (attemptsCounter == 0) println("Было загадано число: $targetNumber")
}
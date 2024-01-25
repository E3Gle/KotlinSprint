package lesson5

import kotlin.random.Random

fun main() {
    val listOfWinningNumbers = listOf(Random.nextInt(43), Random.nextInt(43), Random.nextInt(43))
    val userGuesses = mutableListOf<Int>()

    println("Вы участвуете в лотерее! Угадайте верно три числа в диапазоне от 0 до 42, и выиграйте супер-приз!")
    println("Введите первое число: ")
    userGuesses.add(readln().toInt())
    println("Введите второе число: ")
    userGuesses.add(readln().toInt())
    println("Введите третье число: ")
    userGuesses.add(readln().toInt())
    val guessedCorrectly = listOfWinningNumbers.intersect(userGuesses)

    val result = when (guessedCorrectly.size) {
        3 -> "Вы угадали все числа и выиграли джекпот!"
        2 -> "Вы угадали два числа из трёх и получаете крупный приз!"
        1 -> "Вы угадали одно число из трёх и получаете утешительный приз!"
        else -> "К сожалению, вы не угадали ни одного числа"
    }

    println(result)
    print("Выигрышные числа: ${listOfWinningNumbers.joinToString(", ")}")

}
package lesson6

import kotlin.random.Random

fun main() {
    println("Для входа в систему необходимо создать учётную запись. Для этого следуйте инструкциям на экране.\nУкажите желаемый логин: ")
    val userLogin = readln()
    println("Укажите желаемый пароль:")
    val userPassword = readln()
    println("Поздравляем, учётная запись создана!")

    println("Для входа в систему необходимо авторизоваться.\nВведите логин вашей учётной записи: ")
    val inputtedLogin = readln()
    println("Введите пароль вашей учётной записи: ")
    val inputtedPassword = readln()

    if (inputtedLogin == userLogin && inputtedPassword == userPassword) {
        var firstNumber = Random.nextInt(1, 10)
        var secondNumber = Random.nextInt(1, 10)
        var attempts = 3

        println("Для входа необходимо подтвердить, что вы не робот.\nВведите результат сложения двух чисел: $firstNumber и $secondNumber.\nУ вас три попытки")
        while (attempts > 0) {
            when (readln().toInt()) {
                firstNumber + secondNumber -> {
                    println("Добро пожаловать!")
                    break
                }

                else -> {
                    firstNumber = Random.nextInt(1, 10)
                    secondNumber = Random.nextInt(1, 10)
                    println("Неверно. Введите результат сложения двух чисел: $firstNumber и $secondNumber. У вас осталось ${--attempts}")
                }
            }
        }

    } else {
        println("Данные введены неверно. Введите заново ваши логин и пароль.")
    }
}
package lesson6

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
        var firstNumber = (1..9).random()
        var secondNumber = (1..9).random()
        var attempts = 3

        println("Для входа необходимо подтвердить, что вы не робот.\nВведите результат сложения двух чисел: $firstNumber и $secondNumber.\nУ вас три попытки")
        while (attempts > 0) {
            when (readln().toInt()) {
                firstNumber + secondNumber -> {
                    println("Добро пожаловать!")
                    break
                }
                else -> {
                    firstNumber = (1..9).random()
                    secondNumber = (1..9).random()
                    println("Неверно. Введите результат сложения двух чисел: $firstNumber и $secondNumber. У вас осталось ${--attempts} попыток")
                }
            }
        }
    } else {
        println("Данные введены неверно. Введите заново ваши логин и пароль.")
    }
}
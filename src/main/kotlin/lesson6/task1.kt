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
        println("Авторизация прошла успешно.")
    } else {
        println("Данные введены неверно. Введите заново ваши логин и пароль.")
    }

}
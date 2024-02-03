package lesson10

fun main() {
    println("Для регистрации в системе введите поочерёдно желаемые логин и пароль: ")
    val userLogin = readln()
    val userPassword = readln()

    if (validateCredentials(
            userLogin,
            userPassword
        )
    ) println("Добро пожаловать!") else println("Логин или пароль недостаточно длинные")
}

fun validateCredentials(login: String, password: String): Boolean = login.length >= 4 && password.length >= 4
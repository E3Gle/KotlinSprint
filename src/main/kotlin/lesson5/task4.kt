package lesson5

fun main() {
    val registeredPassengers = mutableMapOf("Zaphod" to "PanGalactic")

    println("Пожалуйста, введите логин пассажира: ")
    val inputtedLogin = readln()

    if (registeredPassengers.keys.contains(inputtedLogin)) {
        println("Пожалуйста, введите пароль: ")
        val inputtedPassword = readln()
        if (registeredPassengers[inputtedLogin] == inputtedPassword) {
            println("Добро пожаловать на борт!")
        } else {
            println("Пароль был указан неверно.")
        }
    } else {
        println("Пользователь с таким логином не обнаружен. Предлагаем вам зарегистрироваться.")
    }
}
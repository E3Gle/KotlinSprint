package lesson7

fun main() {
    val codesRange = 1000..9999
    var code = codesRange.random()

    println("Ваш код авторизации: $code\nВведите полученный код для авторизации: ")
    var userInput = readln().toInt()

    while (userInput != code) {
        code = codesRange.random()
        println(
            "Вы ввели код неверно. Ваш новый код: ${code}\n" +
                    "Введите полученный код для авторизации: "
        )
        userInput = readln().toInt()
    }

    println("Добро пожаловать!")
}
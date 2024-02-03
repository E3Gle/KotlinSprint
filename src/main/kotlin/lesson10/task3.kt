package lesson10

fun main() {
    println("Введите желаемую длину пароля: ")
    val userInput = readln().toInt()

    println("Ваш пароль: ${generatePassword(userInput)}")
}

fun generatePassword(length: Int): String {
    val digits = 0..9
    val specialCharacters = "!\"#\$%&'()*+,-./ "
    val result = mutableListOf<String>()
    var counter = 0

    while (counter < length) {
        if (counter % 2 == 0) result.add(digits.random().toString())
        else result.add(specialCharacters.random().toString())
        counter++
    }
    return result.joinToString("")
}
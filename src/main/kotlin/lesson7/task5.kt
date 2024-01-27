package lesson7

import kotlin.random.Random

fun main() {
    val letters: CharRange = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    val digits: IntRange = 0..9
    var password = ""

    println("Укажите максимальную длину желаемого пароля либо нажмите Enter, чтобы получить пароль с длиной по умолчанию: ")
    val userInput = readln()
    val passwordLength = if (userInput == "") MIN_PASSWORD_LENGTH else userInput.toInt()

    while (password.length < passwordLength) {
        when (Random.nextInt(3)) {
            0 -> password += letters.random()
            1 -> password += capitalLetters.random()
            else -> password += digits.random()
        }
    }
    println(password)
}

const val MIN_PASSWORD_LENGTH = 6
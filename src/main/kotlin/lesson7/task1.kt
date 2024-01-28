package lesson7

fun main() {
    val letters: CharRange = 'a'..'z'
    val digits: IntRange = 0..9
    val passwordRange = 1..PASSWORD_SIZE
    var result = ""

    for (i in passwordRange) {
        if (i % 2 == 0) result += digits.random()
        else result += letters.random()
    }
    println(result)
}

const val PASSWORD_SIZE = 6
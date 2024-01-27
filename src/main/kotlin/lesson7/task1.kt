package lesson7

fun main() {
    val letters: CharRange = 'a'..'z'
    val digits: IntRange = 0..9
    var counter = 0
    var result = ""

    while (counter < 6) {
        if (counter % 2 == 0) result += letters.random()
        else result += digits.random()
        counter++
    }
    println(result)
}
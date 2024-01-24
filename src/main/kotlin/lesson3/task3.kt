package lesson3

fun main() {
    table(2)
}

fun table(digit: Int) {
    val range = 1..9
    for (i in range) {
        println("$digit * $i = ${i * digit}")
    }
}
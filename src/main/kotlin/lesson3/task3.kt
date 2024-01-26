package lesson3

fun main() {
    val targetNumber = 2
    val range = 1..9

    for (i in range) {
        println("$targetNumber * $i = ${i * targetNumber}")
    }
}
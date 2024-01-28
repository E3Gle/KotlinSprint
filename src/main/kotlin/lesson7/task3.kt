package lesson7

fun main() {
    println("Укажите число: ")

    val result = mutableListOf<String>()
    val userInput = readln().toInt()

    for (i in 0..userInput step 2) {
        result.add("$i")
    }
    println(result.joinToString(", "))
}
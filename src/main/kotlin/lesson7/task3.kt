package lesson7

fun main() {
    println("Укажите число: ")

    val result = mutableListOf<String>()
    val userInput = readln().toInt()

    val evenNumbersProgression = 0..userInput step 2

    for (i in evenNumbersProgression) {
        result.add("$i")
    }
    println(result.joinToString(", "))
}
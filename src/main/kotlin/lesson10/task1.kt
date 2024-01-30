package lesson10

fun main() {
    val userResult = diceThrow()
    println("Вы бросаете кубик, и выпадает: $userResult")

    val aiResult = diceThrow()
    println("Компьютер бросает кубик, и выпадает: $aiResult")

    val result = when {
        userResult < aiResult -> "Победили машины"
        userResult > aiResult -> "Победило человество"
        else -> "Ничья"
    }
    println(result)
}

fun diceThrow(): Int = (1..6).random()
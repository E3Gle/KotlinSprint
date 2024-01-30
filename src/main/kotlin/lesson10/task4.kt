package lesson10

fun main() {

    var userVictories = 0
    var userChoice: String

    do {
        userVictories += playGame()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        userChoice = readln()
    } while (userChoice.lowercase() != "нет")

    println("Всего вы выиграли $userVictories партий")
}

fun diceThrow(): Int = (1..6).random()

fun playGame(): Int {
    val userResult = diceThrow()
    println("Вы бросаете кубик, и выпадает: $userResult")

    val aiResult = diceThrow()
    println("Компьютер бросает кубик, и выпадает: $aiResult")

    val isPlayerWon: Boolean

    val result = when {
        userResult < aiResult -> "Победили машины"
        userResult > aiResult -> "Победило человество"
        else -> "Ничья"
    }
    println(result)
    isPlayerWon = result == "Победило человество"

    return if (isPlayerWon) 1 else 0
}
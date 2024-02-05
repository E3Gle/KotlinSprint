package lesson16

fun main() {
    val dice = Dice()

    dice.throwDice()
}

class Dice {
    private val result = (1..6).random()

    fun throwDice() {
        println("На кубике выпало $result")
    }
}

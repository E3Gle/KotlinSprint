package lesson4

fun main() {
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${IS_SUNNY && IS_TENT_OPEN && HUMIDITY == 20 && SEASON != "Winter"}"
    )
}

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val SEASON = "Winter"
package lesson4

fun main() {
    val isSunnyToday = true
    val isTentOpenNow = true
    val humidityToday = 20
    val seasonNow = "Winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    (IS_SUNNY == isSunnyToday)
                            && (IS_TENT_OPEN == isTentOpenNow)
                            && (HUMIDITY == humidityToday)
                            && (WRONG_SEASON != seasonNow)
                }"
    )
}

const val IS_SUNNY = true
const val IS_TENT_OPEN = true
const val HUMIDITY = 20
const val WRONG_SEASON = "Winter"
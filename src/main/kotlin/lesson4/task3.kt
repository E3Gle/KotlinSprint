package lesson4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val season = "Winter"

    areConditionsWell(isSunny, isTentOpen, humidity, season)
}

fun areConditionsWell(isSunny: Boolean, isTentOpen: Boolean, humidity: Int, season: String) {
    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isTentOpen && humidity == 20 && season != "Winter"}")
}
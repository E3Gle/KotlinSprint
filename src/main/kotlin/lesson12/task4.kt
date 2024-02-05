package lesson12

fun main() {

    val day1 = TheseDaysWeather(13, 15, false)
}

class TheseDaysWeather(
    private val dayWeather: Int,
    private val nightWeather: Int,
    private val isPrecipitated: Boolean
) {

    init {
        println("dayWeather = $dayWeather, nightWeather = $nightWeather, isPrecipitated = $isPrecipitated")
    }
}
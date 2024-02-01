package lesson12

fun main() {

    val day1 = DaysWeather(13, 15, false)

    day1.printDayWeather()
}

class DaysWeather(var dayWeather: Int, var nightWeather: Int, var isPrecipitated: Boolean) {

    fun printDayWeather() {
        println("dayWeather = $dayWeather, nightWeather = $nightWeather, isPrecipitated = $isPrecipitated")
    }
}
package lesson12

fun main() {

    val day1 = DaysWeather(13, 15, false)

    day1.printDayWeather()
}

class DaysWeather(private var dayWeather: Int,private var nightWeather: Int,private var isPrecipitated: Boolean) {

    fun updateWeatherData(dayWeather: Int, nightWeather: Int, isPrecipitated: Boolean) {
        this.dayWeather = dayWeather
        this.nightWeather = nightWeather
        this.isPrecipitated = isPrecipitated
    }

    fun printDayWeather() {
        println("dayWeather = $dayWeather, nightWeather = $nightWeather, isPrecipitated = $isPrecipitated")
    }
}
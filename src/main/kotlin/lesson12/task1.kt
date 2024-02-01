package lesson12

fun main() {

    val day1 = WeatherOfTheDay()
    day1.updateWeatherData(12, 11, true)
    val day2 = WeatherOfTheDay()
    day2.updateWeatherData(14, 12, true)
    day1.printDayWeather()
    day2.printDayWeather()
}

class WeatherOfTheDay {
    private var dayWeather: Int = 0
    private var nightWeather: Int = 0
    private var isPrecipitated: Boolean = false

    fun updateWeatherData(dayWeather: Int, nightWeather: Int, isPrecipitated: Boolean) {
        this.dayWeather = dayWeather
        this.nightWeather = nightWeather
        this.isPrecipitated = isPrecipitated

    }

    fun printDayWeather() {
        println("dayWeather = $dayWeather, nightWeather = $nightWeather, isPrecipitated = $isPrecipitated")
    }
}
package lesson12

fun main() {

    val day1 = WeatherInDays(287, 273, false)

    day1.printDayWeather()
}

class WeatherInDays(dayWeather: Int, nightWeather: Int, isPrecipitated: Boolean) {

    private var _dayWeather = dayWeather
        get() {
            field -= 273
            return field
        }

    private var _nightWeather = nightWeather
        get() {
            field -= 273
            return field
        }

    private var _isPrecipitated = isPrecipitated

    fun printDayWeather() {
        println("dayWeather = $_dayWeather, nightWeather = $_nightWeather, isPrecipitated = $_isPrecipitated")
    }
}
package lesson15

fun main() {

    val weatherServer = WeatherServer()

    weatherServer.sendWeatherData(Temperature())
    weatherServer.sendWeatherData(PrecipitationAmount())
}

class WeatherServer {
    fun sendWeatherData(T: WeatherStationStats) {
        if (T is Temperature) println("Отправляю данные о температуре")
        else println("Отправляю данные о количестве осадков")
    }
}

class Temperature : WeatherStationStats()

class PrecipitationAmount : WeatherStationStats()
abstract class WeatherStationStats
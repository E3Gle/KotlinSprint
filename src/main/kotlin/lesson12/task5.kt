package lesson12

fun main() {

    val listOfDaysWeather = mutableListOf<AnotherWeatherDays>()
    val listOfDayTemperatures = mutableListOf<Int>()
    val listOfNightTemperatures = mutableListOf<Int>()
    val listOfPrecipitatedDays = mutableListOf<Boolean>()
    var counter = 30

    while (counter > 0) {
        listOfDaysWeather.add(AnotherWeatherDays((0..30).random(), (0..30).random(), (0..1).random().bool()))
        counter--
    }

    listOfDaysWeather.forEach {
        listOfDayTemperatures.add(it.dayWeather)
        listOfNightTemperatures.add(it.nightWeather)
        if (it.isPrecipitated) listOfPrecipitatedDays.add(it.isPrecipitated)
    }

    println("Average temperature of days: ${listOfDayTemperatures.average()}")
    println("Average temperature of nights: ${listOfNightTemperatures.average()}")
    println("Number of days with precipitations: ${listOfPrecipitatedDays.size}")

}

fun Int.bool(): Boolean {
    return this == 1
}

class AnotherWeatherDays(
    val dayWeather: Int,
    val nightWeather: Int,
    val isPrecipitated: Boolean
)
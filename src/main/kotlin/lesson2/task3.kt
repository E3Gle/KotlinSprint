package lesson2

fun main() {
    val timeOfDeparture = "9:39"
    val timeInRoad = 457

    val hoursAndMinutes = timeOfDeparture.split(":")
    val hoursInMinutes = hoursAndMinutes.first().toInt() * MINUTES_IN_HOUR
    val timeOfDepartureInMinutes = hoursInMinutes + hoursAndMinutes.last().toInt()

    val timeOfArrival = timeOfDepartureInMinutes + timeInRoad
    val timeOfArrivalHours = timeOfArrival / MINUTES_IN_HOUR
    val timeOfArrivalMinutes = timeOfArrival % MINUTES_IN_HOUR
    println(String.format("%d:%d", timeOfArrivalHours, timeOfArrivalMinutes))
}

const val MINUTES_IN_HOUR = 60
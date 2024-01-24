package lesson2

fun main() {
    val timeOfDeparture = "9:39"
    val timeInRoad = 457

    val hoursAndMinutes = timeOfDeparture.split(":")
    val hoursInMinutes = hoursAndMinutes.first().toInt() * 60
    val timeOfDepartureInMinutes = hoursInMinutes + hoursAndMinutes.last().toInt()

    val timeOfArrival = timeOfDepartureInMinutes + timeInRoad
    val timeOfArrivalHours = timeOfArrival / 60
    val timeOfArrivalMinutes = timeOfArrival % 60
    println(String.format("%d:%d", timeOfArrivalHours, timeOfArrivalMinutes))
}
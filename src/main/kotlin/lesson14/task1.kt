package lesson14

fun main() {

    val flagship = Flagship()
    val freighter = Freighter()
    val icebreaker = Icebreaker()

}

open class Flagship(val speed: Int = 20, val carryingCapacity: Int = 20, val passengersCapacity: Int = 100)

class Freighter : Flagship(speed = 10, carryingCapacity = 100, passengersCapacity = 20)

class Icebreaker(val isIceBreaking: Boolean = true) :
    Flagship(speed = 9, carryingCapacity = 10, passengersCapacity = 10)
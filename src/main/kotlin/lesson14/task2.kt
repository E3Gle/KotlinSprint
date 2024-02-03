package lesson14

fun main() {

    val flagship = Flagship1()
    val freighter = Freighter1()
    val icebreaker = Icebreaker1()

    flagship.loadCargo()
    flagship.printInfo()

    freighter.loadCargo()
    freighter.printInfo()

    icebreaker.loadCargo()
    freighter.printInfo()

}

open class Flagship1(val speed: Int = 20, val carryingCapacity: Int = 20, val passengersCapacity: Int = 100) {
    open fun printInfo() {
        println("Скорость: $speed, грузоподъёмность: $carryingCapacity, количество мест для пассажиров: $passengersCapacity")
    }

    open fun loadCargo() {
        println("Выдвигаю горизонтальный трап со шкафута для погрузки...")
    }
}

class Freighter1 : Flagship1(speed = 10, carryingCapacity = 100, passengersCapacity = 20) {
    override fun loadCargo() {
        println("Активирую погрузочный кран для погрузки...")
    }
}

class Icebreaker1(val isIceBreaking: Boolean = true) :
    Flagship1(speed = 9, carryingCapacity = 10, passengersCapacity = 10) {
    override fun printInfo() {
        println("Скорость: $speed, грузоподъёмность: $carryingCapacity, количество мест для пассажиров: $passengersCapacity, может ли ломать лёд: $isIceBreaking")
    }

    override fun loadCargo() {
        println("Открываю ворота со стороны кормы для погрузки...")
    }
}
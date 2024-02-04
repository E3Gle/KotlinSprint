package lesson15


fun main() {

    val cargoVehicle = CargoVehicle()
    val passengersVehicle = PassengersVehicle()

    cargoVehicle.loadPassenger()
    cargoVehicle.loadCargo()
    cargoVehicle.ride()
    cargoVehicle.unloadPassenger()
    cargoVehicle.unloadCargo()

    passengersVehicle.loadPassenger()
    passengersVehicle.ride()
    passengersVehicle.unloadPassenger()

    cargoVehicle.loadPassenger()
    cargoVehicle.ride()
    cargoVehicle.unloadPassenger()

    cargoVehicle.loadPassenger()
    cargoVehicle.ride()
    cargoVehicle.unloadPassenger()
}

class CargoVehicle : Vehicle(2, 1), Transportable, Rideable, Deliverable {

    override fun ride() {
        println("Грузовая машина едет")
    }

    override fun loadPassenger(): Int {
        println("В грузовую машину сели $passengersCapacity пассажиров")
        return passengersCapacity
    }

    override fun unloadPassenger(): Int {
        println("Из грузовой машины вышли $passengersCapacity пассажиров")
        return passengersCapacity
    }

    override fun loadCargo(): Int {
        println("Грузовая машина загрузила $carryingCapacity тонн груза")
        return carryingCapacity
    }

    override fun unloadCargo(): Int {
        println("Грузовая машина разгрузила $carryingCapacity тонн груза")
        return carryingCapacity
    }

}

class PassengersVehicle : Vehicle(0, 3), Transportable, Rideable {
    override fun ride() {
        println("Легковая машина едет")
    }

    override fun loadPassenger(): Int {
        println("В легковую машину сели $passengersCapacity пассажиров")
        return passengersCapacity
    }

    override fun unloadPassenger(): Int {
        println("Из легковой машины вышли $passengersCapacity пассажиров")
        return passengersCapacity
    }
}

interface Transportable {
    fun loadPassenger(): Int
    fun unloadPassenger(): Int
}

interface Deliverable {
    fun loadCargo(): Int
    fun unloadCargo(): Int
}

interface Rideable {
    fun ride()
}

abstract class Vehicle(val carryingCapacity: Int, val passengersCapacity: Int)
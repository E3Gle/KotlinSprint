package lesson17

fun main() {

    val ship = Ship("Black Pearl", 12, "Tortuga")

    ship.name = "Flying Dutchman"
}

class Ship(name: String, val averageSpeed: Int, val homePort: String) {

    var name = name
        set(value) {
            println("Name can't be changed")
        }
}
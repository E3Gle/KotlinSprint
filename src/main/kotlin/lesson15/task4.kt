package lesson15

fun main() {

    val guitar = Instrument("Guitar", 12)
    val guitarStrings = Component("Guitar strings", 20)

    guitar.searchForGoods()
}

class Instrument(name: String, amountLeft: Int) : WarehouseGoods(name, amountLeft), WarehouseSearch

class Component(name: String, amountLeft: Int) : WarehouseGoods(name, amountLeft)

abstract class WarehouseGoods(val name: String, val amountLeft: Int)

interface WarehouseSearch {
    fun searchForGoods() {
        println("Выполняется поиск...")
    }
}
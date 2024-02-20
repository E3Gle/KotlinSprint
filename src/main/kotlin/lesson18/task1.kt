package lesson18

fun main() {
    val orderCRM = CRMOrder()

    orderCRM.addOrder(1, "Ball")
    println()
    orderCRM.addOrder(2, listOf("Soap", "Bread"))
}

class CRMOrder {

    fun addOrder(orderNumber: Int, goods: String) {
        println("Order number is $orderNumber, goody is $goods")
    }

    fun addOrder(orderNumber: Int, goods: List<String>) {
        println("Order number is $orderNumber, goodies are ${goods.joinToString(", ")}")
    }
}
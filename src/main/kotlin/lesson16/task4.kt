package lesson16

fun main() {

    val order = Order(1, "Open")

    order.requestStatusChange("Closed")
}

class Order(private val orderNumber: Int, private val status: String) {

    private fun changeStatus(newStatus: String) {
        println("Статус изменён на: $newStatus")
    }

    fun requestStatusChange(newStatus: String) {
        println("Отправляем запрос менеджеру...")
        changeStatus(newStatus)
    }
}
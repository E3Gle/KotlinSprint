package lesson4

fun main() {
    val dayOfTraining = 5
    val isEvenDay = dayOfTraining % 2 == 0

    println(
        "Упражнения для рук: ${!isEvenDay}\n" +
                "Упражнения для ног: ${isEvenDay}\n" +
                "Упражнения для спины: ${isEvenDay}\n" +
                "Упражнения для пресса: ${!isEvenDay}"
    )
}
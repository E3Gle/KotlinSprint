package lesson9

fun main() {
    val omeletteIngredients = mutableListOf(2, 50, 15)

    println("Как много порций вы бы хотели приготовить?")
    val userInput = readln().toInt()
    println(
        "На $userInput порций вам понадобится: Яиц – ${omeletteIngredients[0] * userInput}, " +
                "молока – ${omeletteIngredients[1] * userInput}, сливочного масла - ${omeletteIngredients[2] * userInput}"
    )
}
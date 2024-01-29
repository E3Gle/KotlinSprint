package lesson9

fun main() {
    val ingredients = mutableListOf("Мука", "Вода", "Масло")

    println("В рецепте есть базовые ингредиенты: ")
    ingredients.forEach { println(it) }

    println("Желаете добавить еще?")
    var userInput = readln()
    if (userInput.lowercase() == "нет") return
    else {
        println("Какой ингредиент вы хотите добавить?")
        userInput = readln()
        ingredients.add(userInput)
        println("Теперь в рецепте есть следующие ингредиенты: ")
        ingredients.forEach { println(it) }
    }
}
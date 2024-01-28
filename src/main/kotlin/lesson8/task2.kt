package lesson8

fun main() {
    val ingredients = arrayOf("Сосиски", "Мука", "Яблоки", "Ром", "Кокос")
    println("Введите название ингредиента, который вы хотите найти: ")
    val userInput = readln()
    var isIngredientIn = false

    for (i in ingredients) {
        if (i == userInput) isIngredientIn = true
    }

    if (isIngredientIn) println("Ингредиент $userInput в рецепте есть") else println("Такого ингредиента в рецепте нет")
}
package lesson8

fun main() {
    val ingredients = arrayOf("Сосиски", "Мука", "Яблоки", "Ром", "Кокос")
    println("Введите название ингредиента, который вы хотите найти: ")
    val userInput = readln()

    if (userInput in ingredients)
        println("Ингредиент $userInput в рецепте есть")
    else println("Такого ингредиента в рецепте нет")
}
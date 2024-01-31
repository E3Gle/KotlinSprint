package lesson8

fun main() {
    val ingredients = arrayOf("Сосиски", "Мука", "Яблоки", "Ром", "Кокос")
    println("Введите название ингредиента, который вы хотите найти: ")
    val userInput = readln()

    for (i in ingredients) {
        if (i == userInput) {
            println("Ингредиент $userInput в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}
package lesson9

fun main() {
    val ingredients = listOf("Ром", "Мука", "Вода", "Масло")

    println("В рецепте есть следующие ингредиенты: ")
    ingredients.forEach { println(it) }
}
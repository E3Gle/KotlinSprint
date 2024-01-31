package lesson8

fun main() {
    println("Введите количество ингредиентов в рецепте: ")
    val ingredientsCount = readln().toInt()

    println("Поочерёдно введите название ингредиентов для добавления в список: ")
    val ingredients = Array(ingredientsCount) { readln() }

    println(ingredients.joinToString(", "))
}
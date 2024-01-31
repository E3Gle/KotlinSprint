package lesson9

fun main() {
    val ingredients = mutableListOf("Мука", "Вода", "Масло")

    println("В рецепте есть базовые ингредиенты: ")
    println(ingredients.joinToString(", "))

    println("Желаете добавить еще?")

    if (readln().lowercase() == "нет") return
    else {
        println("Какой ингредиент вы хотите добавить?")
        ingredients.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: ")
        println(ingredients.joinToString(", "))
    }
}
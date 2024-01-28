package lesson8

fun main() {
    val ingredients = arrayListOf("Сосиски", "Мука", "Яблоки", "Ром", "Кокос")

    println(ingredients)
    println("Укажите, какой ингредиент вы хотите заменить: ")
    val inputtedIngredient = readln()

    if (ingredients.find { it == inputtedIngredient }.isNullOrEmpty()) {
        println("Такого ингредиента в списке нет")
        return
    } else println("На какой ингредиент вы бы хотели его заменить: ")
    val inputtedIngredientReplacement = readln()

    val originalIngredientIndex = ingredients.indexOf(inputtedIngredient)
    ingredients.remove(inputtedIngredient)
    ingredients.add(originalIngredientIndex, inputtedIngredientReplacement)
    println("Готово! Вы сохранили следующий список: $ingredients")
}
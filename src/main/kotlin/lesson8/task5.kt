package lesson8

fun main() {
    println("Введите количество ингредиентов в рецепте: ")
    val ingredientsCount = readln().toInt()
    var counter = 0
    var ingredients = arrayOf<String>()

    while (counter < ingredientsCount) {
        println("Введите название ингредиента для добавления в список: ")
        val userInput = readln()
        ingredients = ingredients.plus(userInput)
        counter++
        if (counter == ingredientsCount) println(ingredients.joinToString(", "))
    }
}
package lesson9

fun main() {
    println("Введите 5 ингредиентов блюда через запятую: ")
    val userInput = readln()

    val usersIngredients = userInput.split(", ")
    println(usersIngredients.sorted().joinToString(", "))
}
package lesson9

fun main() {
    println("Введите поочерёдно 5 названий ингредиентов блюда: ")
    val userFirst = readln()
    val userSecond = readln()
    val userThird = readln()
    val userFourth = readln()
    val userFifth = readln()

    val usersIngredients =
        listOf(userFirst, userSecond, userThird, userFourth, userFifth).sorted().distinct().toMutableList()
    usersIngredients[0] = usersIngredients.first().replaceFirstChar { it.uppercase() }
    println(usersIngredients.joinToString(", "))
}
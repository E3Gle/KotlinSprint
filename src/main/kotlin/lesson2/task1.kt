package lesson2

fun main() {
    val listOfPupils = listOf(3, 4, 3, 5)
    val averageScore = listOfPupils.sum() / listOfPupils.size.toDouble()
    println(String.format("%.2f", averageScore))
}
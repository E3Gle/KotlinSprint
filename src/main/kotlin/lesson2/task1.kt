package lesson2

fun main() {
    val studentsAndScores = mapOf("Chris" to 3, "Leon" to 4, "Jill" to 3, "Claire" to 5)
    val averageScore = studentsAndScores.values.sum() / studentsAndScores.values.size.toDouble()
    println(String.format("%.2f", averageScore))
}
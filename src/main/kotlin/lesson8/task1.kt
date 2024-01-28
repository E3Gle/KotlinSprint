package lesson8

fun main() {
    val weeklyViews = arrayOf(12, 42, 565, 22, 78, 973, 102)
    println(weeklyViews.reduce { acc, i -> acc + i })
}
package lesson14

fun main() {

    val listOfAllFigures = listOf(
        BlackCircle(radius = 12),
        BlackCircle(radius = 13),
        WhiteCircle(radius = 14),
        WhiteCircle(radius = 15),
        BlackRectangle(width = 4, height = 5),
        BlackRectangle(width = 6, height = 7),
        WhiteRectangle(width = 8, height = 9),
        WhiteRectangle(width = 10, height = 11)
    )

    println(
        "Сумма площадей всех белых фигур: ${
            listOfAllFigures.filter { it.color == "White" }.sumOf { it.calculateAreaOfTheFigure() }
        }"
    )

    println(
        "Сумма периметров всех черных фигур: ${
            listOfAllFigures.filter { it.color == "Black" }.sumOf { it.calculatePerimeterOfTheFigure() }
        }"
    )
}

class BlackCircle(color: String = "Black", radius: Int) : Circle(color, radius)
class WhiteCircle(color: String = "White", radius: Int) : Circle(color, radius)
class BlackRectangle(color: String = "Black", height: Int, width: Int) :
    Rectangle(color, height, width)

class WhiteRectangle(color: String = "White", height: Int, width: Int) :
    Rectangle(color, height, width)

open class Circle(color: String, val radius: Int) : Figure(color) {
    override fun calculateAreaOfTheFigure() = (radius * radius) * PI

    override fun calculatePerimeterOfTheFigure() = 2 * PI * radius
}

open class Rectangle(color: String, val height: Int, val width: Int) : Figure(color) {

    override fun calculateAreaOfTheFigure() = (width * height).toDouble()

    override fun calculatePerimeterOfTheFigure() = (2 * (width + height)).toDouble()
}

abstract class Figure(val color: String) {
    abstract fun calculateAreaOfTheFigure(): Double
    abstract fun calculatePerimeterOfTheFigure(): Double
}

const val PI = 3.14
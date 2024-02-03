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

class BlackCircle(override val color: String = "Black", override val radius: Int) : Circle()
class WhiteCircle(override val color: String = "White", override val radius: Int) : Circle()
class BlackRectangle(override val color: String = "Black", override val height: Int, override val width: Int) :
    Rectangle()

class WhiteRectangle(override val color: String = "White", override val height: Int, override val width: Int) :
    Rectangle()

open class Circle : Figure("") {
    open val radius: Int = 0
    override fun calculateAreaOfTheFigure() = (radius * radius) * PI

    override fun calculatePerimeterOfTheFigure() = 2 * PI * radius
}

open class Rectangle : Figure("") {

    open val width: Int = 0
    open val height: Int = 0
    override fun calculateAreaOfTheFigure() = (width * height).toDouble()

    override fun calculatePerimeterOfTheFigure() = (2 * (width + height)).toDouble()
}

abstract class Figure(open val color: String) {
    abstract fun calculateAreaOfTheFigure(): Double
    abstract fun calculatePerimeterOfTheFigure(): Double
}

const val PI = 3.14
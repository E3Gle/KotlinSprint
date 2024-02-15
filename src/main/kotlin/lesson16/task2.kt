package lesson16

fun main() {

    val circle = Circle(12)

    circle.calculateArea()
    circle.calculateLength()

}

class Circle(private val radius: Int) {
    private val pi = 3.14

    fun calculateArea() {
        println("Площадь круга: ${pi * (radius * radius)}")
    }


    fun calculateLength() {
        println("Длина окружности: ${pi * (radius + radius)}")
    }
}
package lesson5

fun main() {
    println("Для входа в приложение необходимо доказать, что вы - не робот.\nВам предстоит написать и решить простой арифметический пример")
    println("Введите первое произвольное натуральное число:")
    val firstNumber = readln().toInt()
    println("Введите второе произвольное натуральное число:")
    val secondNumber = readln().toInt()
    println("Введите сумму раннее введённых чисел:")
    val sumOfNumbers = readln().toInt()
    if (sumOfNumbers == (firstNumber + secondNumber)) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}
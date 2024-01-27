package lesson5

import kotlin.random.Random

fun main() {
    val lowerEdgeValue = Random.nextInt(43)
    val higherEdgeValue = Random.nextInt(43)
    println("Вы участвуете в лотерее! Для победы нужно угадать два числа в диапазоне от 0 до 42.")

    println("Введите первое число:")
    val userFirstNumber = readln().toInt()
    val isFirstEqualLowerValue = userFirstNumber == lowerEdgeValue
    val isFirstEqualHigherValue = userFirstNumber == higherEdgeValue

    println("Введите второе число:")
    val userSecondNumber = readln().toInt()
    val isSecondEqualLowerValue = userSecondNumber == lowerEdgeValue
    val isSecondEqualHigherValue = userSecondNumber == higherEdgeValue

    val result = when {
        (isFirstEqualLowerValue && isSecondEqualHigherValue) || (isSecondEqualLowerValue && isFirstEqualHigherValue) -> "Поздравляем! Вы выиграли главный приз!"
        (!isFirstEqualLowerValue && !isSecondEqualHigherValue) && (!isSecondEqualLowerValue && !isFirstEqualHigherValue) -> "Неудача!"
        else -> "Вы выиграли утешительный приз!"
    }
    println(result)
    println("Выигрышные числа: $lowerEdgeValue и $higherEdgeValue")
}
package lesson5

import java.util.*

fun main() {
    val currentYear = Calendar.getInstance().weekYear

    println("Введите год вашего рождения")
    val userYearOfBirth = readln().toInt()
    val userAge = currentYear - userYearOfBirth

    val result = when {
        userAge >= AGE_OF_MAJORITY -> "Показать экран со скрытым контентом"
        else -> "Вы должны быть старше 18 лет для просмотра данного контента"
    }

    println(result)
}

const val AGE_OF_MAJORITY = 18
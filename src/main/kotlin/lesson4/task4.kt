package lesson4

fun main() {
    val dayOfTraining = 5
    val armsAndAbsDay: Boolean
    val legsAndBackDay: Boolean

    if (dayOfTraining % 2 == 0) {
        legsAndBackDay = true
        armsAndAbsDay = false
    } else {
        legsAndBackDay = false
        armsAndAbsDay = true
    }

    println(
        "Упражнения для рук: $armsAndAbsDay\n" +
                "Упражнения для ног: $legsAndBackDay\n" +
                "Упражнения для спины: $armsAndAbsDay\n" +
                "Упражнения для пресса: $legsAndBackDay"
    )
}
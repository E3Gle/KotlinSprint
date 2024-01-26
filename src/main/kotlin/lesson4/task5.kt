package lesson4

fun main() {
    println("Пожалуйста, укажите, цел ли корабль (true или false)")
    val isIntact = readln().toBoolean()
    println("Пожалуйста, укажите число экипажа (натуральное число)")
    val crew = readln().toInt()
    println("Пожалуйста, уажите количество ящиков провизии на борту (натуральное число)")
    val provision = readln().toInt()
    println("Пожалуйста, уажите благоприятна ли погода (true или false)")
    val isWeatherWell = readln().toBoolean()

    println(
        "Корабль может приступить к долгосрочному плаванию: " +
                "${(isIntact && crew in MIN_CREW..NORMAL_CREW && provision > MIN_PROVISION) 
                        || (!isIntact && crew == NORMAL_CREW && isWeatherWell && provision >= MIN_PROVISION)}"
    )
}

const val MIN_CREW = 55
const val NORMAL_CREW = 70
const val MIN_PROVISION = 50
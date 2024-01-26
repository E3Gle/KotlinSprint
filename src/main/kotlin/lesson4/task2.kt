package lesson4

fun main() {
    val pieceOneWeight = 20
    val pieceOneVolume = 80

    val pieceTwoWeight = 50
    val pieceTwoVolume = 100

    checkIfAverage(pieceOneWeight, pieceOneVolume)
    checkIfAverage(pieceTwoWeight, pieceTwoVolume)
}

fun checkIfAverage(weight: Int, volume: Int) {
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${
                    (volume < AVERAGE_VOLUME)
                            && (weight >= AVERAGE_WEIGHT_MIN && weight <= AVERAGE_WEIGHT_MAX)
                }"
    )
}

const val AVERAGE_WEIGHT_MIN = 35
const val AVERAGE_WEIGHT_MAX = 100
const val AVERAGE_VOLUME = 100
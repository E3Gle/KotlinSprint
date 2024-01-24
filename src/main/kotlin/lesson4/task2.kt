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
    val averageWeightMin = 35
    val averageWeightMax = 100
    val averageVolume = 100
    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${
                    (volume <= averageVolume)
                            && (weight >= averageWeightMin && weight <= averageWeightMax)
                }"
    )
}
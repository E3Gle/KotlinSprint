package lesson2

import kotlin.math.roundToInt

fun main() {
    val buff = 20
    val crystalOre = 7
    val ironOre = 11

    val crystalOreWithBuff = (crystalOre + (crystalOre * (buff / 100.0)))
    val ironOreWithBuff = (ironOre + (ironOre * (buff / 100.0)))

    println("Bonus Crystal Ore: ${(crystalOreWithBuff - crystalOre).roundToInt()}")
    println("Bonus Iron Ore: ${(ironOreWithBuff - ironOre).roundToInt()}")
}
package lesson2

import kotlin.math.roundToInt

fun main() {
    val buff = 0.2
    val crystalOre = 7
    val ironOre = 11

    val crystalOreWithBuff = (crystalOre + (crystalOre * buff)).roundToInt()
    val ironOreWithBuff = (ironOre + (ironOre * buff)).roundToInt()
    println("Crystal Ore: $crystalOreWithBuff")
    println("Iron Ore: $ironOreWithBuff")
}
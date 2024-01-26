package lesson3

fun main() {
    val userMove = "D2-D4;0"
    val (oldPosition, newPosition, moveNumber) = userMove.split("-", ";")
    println(oldPosition)
    println(newPosition)
    println(moveNumber)
}
package lesson3

fun main() {
    var oldPosition = "E2"
    var newPosition = "E4"
    var moveNumber = 1
    var moveInfo = "$oldPosition-$newPosition;$moveNumber"
    println(moveInfo)

    oldPosition = "D2"
    newPosition = "D3"
    moveNumber++
    moveInfo = "$oldPosition-$newPosition;$moveNumber"
    println(moveInfo)
}
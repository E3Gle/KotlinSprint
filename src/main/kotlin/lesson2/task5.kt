package lesson2

import kotlin.math.pow

fun main() {
    val deposit = 70_000
    val interestRate = 16.7
    val depositTime = 20 //in years
    val daysInYear = 365 //excluding leap years
    val interestPaymentInterval = 365 //in days
    val timesOfInterestPayment = daysInYear / interestPaymentInterval * depositTime

    val depositWithInterest = deposit * (1 + (interestRate / 100) * 365 / 365).pow(timesOfInterestPayment)
    println(String.format("%.3f", depositWithInterest))
}

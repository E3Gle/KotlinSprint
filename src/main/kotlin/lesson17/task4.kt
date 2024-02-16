package lesson17

fun main() {

    val parcel = Parcel(12, "Moscow")

    println(parcel.locationChangesCounter)
    parcel.location = "Tula"
    println(parcel.locationChangesCounter)

}

class Parcel(val trackingNumber: Int, location: String) {
    var locationChangesCounter = 0

    var location = location
        set(value) {
            field = value
            locationChangesCounter++
        }
}
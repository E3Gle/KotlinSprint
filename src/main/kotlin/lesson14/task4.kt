package lesson14

fun main() {

    val satellitePhobos = Satellite("Phobos", true, false)
    val satelliteDeimos = Satellite("Deimos", false, false)
    val planetMars = Planet("Mars", true, false, listOf(satellitePhobos, satelliteDeimos))

    print(
        "Planets is: ${planetMars.name}, its satellites are: ${
            planetMars.listOfSatelllites.joinToString(", ") { it.name }
        }"
    )

}

class Planet(
    name: String,
    isLandable: Boolean,
    hasAtmosphere: Boolean,
    val listOfSatelllites: List<Satellite>
) : CelestialBody(name, isLandable, hasAtmosphere)

class Satellite(
    name: String,
    isLandable: Boolean,
    hasAtmosphere: Boolean
) : CelestialBody(name, isLandable, hasAtmosphere)

open class CelestialBody(
    val name: String,
    val isLandable: Boolean,
    val hasAtmosphere: Boolean
)
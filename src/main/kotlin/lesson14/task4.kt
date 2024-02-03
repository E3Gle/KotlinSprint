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
    override val name: String,
    override val isLandable: Boolean,
    override val hasAtmosphere: Boolean,
    val listOfSatelllites: List<Satellite>
) : CelestialBody()

class Satellite(
    override val name: String,
    override val isLandable: Boolean,
    override val hasAtmosphere: Boolean
) : CelestialBody()

open class CelestialBody(
    open val name: String = "",
    open val isLandable: Boolean = false,
    open val hasAtmosphere: Boolean = false
)
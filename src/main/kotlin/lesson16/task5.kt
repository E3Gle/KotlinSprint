package lesson16

fun main(){

    val player = Playa("Ada", 10, 5)

    player.takePunch(5)
    player.getHealing(2)
    player.takePunch(7)
    player.getHealing(2)

}

class Playa(val name: String, private var health: Int, var strength: Int) {

    private var isDead = false

    fun takePunch(receivedDamage: Int) {
        health -= receivedDamage
        println("Health now is: $health")
        if (health <= 0) becomeDead()
    }

    fun getHealing(receivedHealing: Int) {
        if (!isDead) health += receivedHealing
        println("Health now is: $health")
    }

    private fun becomeDead() {
        isDead = true
        health = 0
        strength = 0
    }
}
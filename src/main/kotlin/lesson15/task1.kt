package lesson15

fun main() {

    val duck = Duck()
    val gull = Gull()
    val crucianCarp = CrusianCarp()

    duck.fly()
    duck.swim()

    gull.fly()
    gull.swim()

    crucianCarp.swim()

}

@FunctionalInterface
interface Flying {
    fun fly()
}

@FunctionalInterface
interface Swimming {
    fun swim()
}

class CrusianCarp : Swimming {
    override fun swim() {
        println("Карась плывёт")
    }
}

class Gull() : Swimming, Flying {
    override fun fly() {
        println("Чайка плывёт")
    }

    override fun swim() {
        println("Чайка летит")
    }
}

class Duck() : Swimming, Flying {
    override fun fly() {
        println("Утка плывёт")
    }

    override fun swim() {
        println("Утка летит")
    }
}
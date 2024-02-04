package lesson11

fun main() {
    val firstUser = User(1, "First", "1234", "aa@aa.aa")
    val secondUser = User(2, "Second", "4321", "bb@bb.bb")

    println(firstUser)
    println(secondUser)
}

data class User(val id: Int, val login: String, val password: String, val email: String)
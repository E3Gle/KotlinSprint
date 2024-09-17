package lesson16

fun main() {

    val user = UserX("Leon", "1234")

    user.validatePassword("1234")
    user.validatePassword("124")
}

class UserX(val login: String, private val password: String) {
    fun validatePassword(str: String) {
        println(if (str == password) "Password is correct" else "Password is not correct")
    }
}
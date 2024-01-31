package lesson11

fun main() {

    val user = User2(1, "Bob","1234", "aa@aa.aa")
    user.updateBio()
    user.updatePassword()
    user.printInfo()
}

class User2(val id: Int, val login: String, var password: String, val email: String, var bio: String = "Bio") {
    fun printInfo() {
        println("id = $id, login = $login, password = $password, email = $email, bio = $bio")
    }

    fun updateBio() {
        println("Введите новое био для пользователя: ")
        val userInput = readln()
        bio = userInput
    }

    fun updatePassword() {
        println("Введите текущий пароль: ")
        val userInput = readln()
        if (userInput != password) println("Пароль указан неверно")
        else {
            println("Введите новый пароль")
            password = readln()
        }
    }
}
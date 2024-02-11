package lesson17

fun main() {

    val userLeon = NewestUser("Leon", "1234")

    userLeon.login = "New Leon"
    userLeon.password = "4321"
    println(userLeon.password)
}

class NewestUser(login: String, password: String) {

    var login = login
        set(value) {
            field = value
            println("Логин успешно изменён")
        }
    var password = password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            return "*".repeat(field.length)
        }
}
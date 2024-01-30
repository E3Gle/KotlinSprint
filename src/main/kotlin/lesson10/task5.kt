package lesson10

fun main() {
    println(getBasketContents(authUser("1234", "1234")))
    println(getBasketContents(authUser("test", "1234")))
}

fun authUser(login: String, password: String): String? {
    val digits = 0..9
    val letters = 'a'..'z'
    var counter = 32
    val token = mutableListOf<String>()
    val userLogin = "test"
    val userPassword = "1234"

    return if (login == userLogin && password == userPassword) {
        while (counter > 0) {
            if (counter % 2 == 0) {
                token.add(digits.random().toString())
            } else {
                token.add(letters.random().toString())
            }
            counter--
        }
        token.joinToString("")
    } else null
}

fun getBasketContents(token: String?): List<String>? {
    val basket = listOf("Мука", "Хлеб", "Масло", "Вода")
    return if (token != null) basket else null
}
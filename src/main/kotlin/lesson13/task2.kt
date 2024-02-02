package lesson13

fun main() {

    val user = Contacts("Claire", 5550005555, null)
    user.printContactInfo()

}

class Contacts(val name: String, val phoneNumber: Long, val companyName: String?) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${companyName ?: "<не указано>"}")
    }
}
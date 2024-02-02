package lesson13

fun main() {

    val listOfContacts = listOf(
        PhoneContacts("Claire", 5550005555, null),
        PhoneContacts("Leon", 5550005554, null),
        PhoneContacts("Biba", 5550005553, "Meta"),
        PhoneContacts("Boba", 5550005552, "Reddit"),
        PhoneContacts("Sam", 5550005551, "null")
    )

    println(listOfContacts.filter { it.companyName != null && it.companyName != "null" }.map { it.companyName }.distinct())
}

class PhoneContacts(val name: String, val phoneNumber: Long, val companyName: String?) {
    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${companyName ?: "<не указано>"}")
    }
}
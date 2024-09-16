package lesson13

fun main() {

    val contacts = mutableListOf<ContactsScheme>()

    var counter = 0
    do {
        addContactToListOfContacts(contacts)
        counter++
    } while (counter < 3)

    contacts.forEach { it.printContactInfo() }

}

fun addContactToListOfContacts(list: MutableList<ContactsScheme>) {
    println("Введите имя контакта: ")
    val userInputName = readln()
    println("Введите номер телефона контакта: ")
    val userInputPhoneNumber = readln().toLongOrNull()
    println("Введите название компании контакта: ")
    val userInputCompanyName = readln()

    when {
        userInputPhoneNumber == null -> println("Вы не указали номер телефона, контакт не будет добавлен в список контактов!")
        userInputCompanyName == "" -> list.add(
            ContactsScheme(
                userInputName,
                userInputPhoneNumber
            )
        )

        else -> list.add(ContactsScheme(userInputName, userInputPhoneNumber, userInputCompanyName))
    }
}

class ContactsScheme(val name: String, val phoneNumber: Long?, val companyName: String? = null) {

    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${companyName ?: "<не указано>"}")
    }
}
package lesson13

fun main() {

    val contacts = mutableListOf<ContactsScheme>()

    addContactToListOfContacts(contacts)
    addContactToListOfContacts(contacts)
    addContactToListOfContacts(contacts)

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
                userInputPhoneNumber,
                null
            )
        )

        else -> list.add(ContactsScheme(userInputName, userInputPhoneNumber, userInputCompanyName))
    }
}

class ContactsScheme(val name: String, val phoneNumber: Long?, val companyName: String?) {

    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${companyName ?: "<не указано>"}")
    }
}
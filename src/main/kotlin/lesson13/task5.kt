package lesson13

fun main() {

    println("Введите номер телефона: ")
    try {
        val userInput = readln().toLong()
        val newContact = AnotherContactsList("Frodo", userInput, "Ring Bearers")
        newContact.printContactInfo()
    }catch (e: NumberFormatException){
        println("Для указания номера телефона используйте только цифры!")
    }

}
class AnotherContactsList(val name: String, val phoneNumber: Long?, val companyName: String?) {

    fun printContactInfo() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: ${companyName ?: "<не указано>"}")
    }
}
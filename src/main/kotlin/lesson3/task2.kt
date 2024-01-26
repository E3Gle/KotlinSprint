package lesson3

fun main() {
    var surname = "Андреева"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    var age = 20
    printRecord(surname, name, patronymic, age)

    surname = "Сидорова"
    age = 22
    printRecord(surname, name, patronymic, age)
}

fun printRecord(surname: String, name: String, patronymic: String, age: Int) {
    println("$surname $name $patronymic, $age")
}
package lesson4

fun main() {
    val totalOfTables = 13
    val bookedTablesForToday = 13
    val bookedTablesForTomorrow = 9
    println(
        "Доступность столиков на сегодня: ${totalOfTables > bookedTablesForToday}\n" +
                "Доступность столиков на завтра: ${totalOfTables > bookedTablesForTomorrow}"
    )
}
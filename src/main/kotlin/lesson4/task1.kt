package lesson4

fun main() {
    val totalOfTables = 13
    val bookedTablesForToday = 13
    val bookedTablesForTomorrow = 9
    println(
        "Доступность столиков на сегодня: ${if (totalOfTables > bookedTablesForToday) "true" else "false"}\n" +
                "Доступность столиков на завтра: ${if (totalOfTables > bookedTablesForTomorrow) "true" else "false"}"
    )
}
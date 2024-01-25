package lesson2

fun main() {
    val employeesCount = 50
    val employeeSalary = 30_000
    val internsCount = 30
    val internSalary = 20_000

    val employeesSalaryMonthlyFund = employeeSalary * employeesCount
    val internsSalaryMonthlyFund = internSalary * internsCount
    val totalSalaryMonthlyFund = employeesSalaryMonthlyFund + internsSalaryMonthlyFund
    val averageSalary = totalSalaryMonthlyFund / (employeesCount + internsCount)

    println(employeesSalaryMonthlyFund)
    println(totalSalaryMonthlyFund)
    println(averageSalary)
}
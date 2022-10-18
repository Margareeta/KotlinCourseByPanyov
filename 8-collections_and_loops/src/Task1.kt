/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса Employee  и возвращает средний возраст всех сотрудников.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val employees = listOf(
        Employee("John Doe", 30),
        Employee("Jane Doe", 35),
        Employee("Jack Dowson", 20),
        Employee("Rose Dowson", 18)
    )
    println(averageAgeOfAllEmployees(employees))
}

fun averageAgeOfAllEmployees(employeeList: List<Employee>): Int {
    var amount: Int = 0
    for (employee in employeeList) {
        amount += employee.age
    }
    return amount /employeeList.size
}
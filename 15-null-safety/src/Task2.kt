/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
    val employee:Employee =
        Employee("Vasya", company = Company("Coca-Cola", address = Address("adress", "NY")))
    val employee1: Employee = Employee("Petya", null)

    println(employeeCity(employee))
    println(employeeCity(employee1))

}
fun  employeeCity(employee: Employee): String?{
    if(employee.company != null && employee.company.address != null)
        return employee.company.address.city
   return "unknown"
}
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)
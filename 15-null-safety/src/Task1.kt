/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, salary: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {
    val employee1: SomeEmployee = SomeEmployee("John", 2345)
    val employee2: SomeEmployee = SomeEmployee("Jim", 4567)
    val employee3: SomeEmployee = SomeEmployee("Jill", 7867)
    val employee4: SomeEmployee = SomeEmployee("Jane", 7890)

    val employees: List<SomeEmployee> = listOf(employee1, employee2, employee3, employee4) as List<SomeEmployee>

    val employeeBySalary = findBySalary(25, employees)
    employeeBySalary?.callToClient("Map")


}

fun findBySalary(salary: Int, employees: List<SomeEmployee>): SomeEmployee? {
    for (e in employees)
        if (salary == e.salary)
            return e
    return null
}

class SomeEmployee(
    val name: String,
    val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }

}




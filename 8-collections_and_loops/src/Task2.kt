import java.util.Arrays.stream
import kotlin.streams.toList

/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса Employee и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    var employees = listOf(
        Employee("John Doe", 30),
        Employee("Jane Doe", 35),
        Employee("Jack Dowson", 20),
        Employee("Rose Dowson", 18)
    )
    println(youngestEmployeesAge(employees))
}

fun youngestEmployeesAge(employees: List<Employee>): Employee {
var youngest: Employee = employees[0]
    for (e in employees){
        if(youngest.age > e.age)
            youngest = e
    }
    return youngest
}
/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом, чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {
    val employee1: SomeEmployee = SomeEmployee("John", 2345)
    val employee2: SomeEmployee = SomeEmployee("Jim", 4567)
    val employee3: SomeEmployee = SomeEmployee("Jill", 7867)
    val employee4: SomeEmployee = SomeEmployee("Jane", 7890)

    val employees: List<SomeEmployee> = listOf(employee1, employee2, employee3, employee4) as List<SomeEmployee>
    try {
        println(findBySalary(2345, employees))
    }catch (e:Exception){
        print(e.toString())
    }

}
fun findBySalary(salary: Int, employees: List<SomeEmployee>): SomeEmployee? {
    for (e in employees)
        if (salary == e.salary)
            return e
    throw Exception("The employee not found")
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}
/*
Написать функцию, которая возвращает количество элементов, удовлетворяющих условию:
fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int

Дата класс User уже описан в отдельном файле в этом разделе и доступен здесь.

Проверить работу написанной функции на примере каких-нибудь входных данных.

Для этой задачи есть видео с разбором.
*/

fun main() {
    val users = listOf(
        User("Kirill", 45),
        User("Olga", 32),
        User("Marina", 12)
    )
    println(elementsCount(users) { it.age > 10 })
}

fun elementsCount(users: List<User>, condition: (User) -> Boolean): Int {
    var res: Int = 0
    for (u in users)
        if(condition(u))
            res++
    return res
}
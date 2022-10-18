/*
Написать функцию, которая отвечает на вопрос присутствует ли в коллекции элемент, который удовлетворяет условиям
fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean


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
    println(containsElement(users) { user -> user.name == "Vasily" })
}

fun containsElement(users: List<User>, condition: (User) -> Boolean): Boolean {
    for (u in users)
        if (condition(u) == true)
            return true
    return false
}
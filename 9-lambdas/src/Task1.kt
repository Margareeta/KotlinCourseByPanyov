/*
Написать функцию преобразования каждого элемента коллекции пользователей в String в соответствии с заданным лямбда-выражением
fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String>

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
    val result = convertToStrings(users) { user: User -> "Name:${user.name}, Age:${user.age}" }
    println(result)
}

fun convertToStrings(users: List<User>, conversion: (User) -> String): List<String> {
    var res = mutableListOf<String>()
    for (u in users) {
        val string = conversion(u)
        res.add(string)
    }
    return res
}
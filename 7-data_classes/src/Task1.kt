/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
    val user1 = User("John", 36, 4)
    val user2 = User("Jack", 20, 7)
    val car1 = Car("BMW", 4568)
    val car2 = Car("Mazda", 3558)

    println(userStatus(user1))
    println(canRentThisCar(user1, car1))

}
data class User(val name: String, val age: Int, val exp: Int)
data class Car(val brand: String, val rentPrice: Int)

fun userStatus(user: User): String{
    val res: String =
        if(user.age >= 26 && user.exp >=6)
        "Any car is available"
    else if(user.age >=21 || user.exp>=2)
        "Any car except for Audi and BMW is available"
        else
            "Service is not available"
    return res
    }
fun canRentThisCar(user: User, car: Car): Boolean{
    val res = when{
        user.age >= 26 && user.exp >=6 -> true
        user.age >= 21 && user.exp >= 2 && car.brand != "Audi" && car.brand != "BMW" -> true
        else -> false
    }
    return res
}

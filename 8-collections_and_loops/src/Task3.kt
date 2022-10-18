/*
Для классов User и Car из задач по дата-классам написать функцию, которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
    val user = User("Kirill", 24, 3)
    val car1 = Car("BMW", "x5", 15.3)
    val car2 = Car("Kia", "Rio", 10.1)
    val car3 = Car("Renault", "Capture", 10.5)

    val cars = listOf(car1, car2, car3)
    println(availableCars(user, cars))

}

fun userStatus(user: User): String {
    val userStatus = when {
        user.age >= 26 && user.experience >= 6 -> "Доступны все авто"
        user.age >= 21 && user.experience >= 2 -> "Доступны все авто кроме Audi и BMW"
        else -> "Услуги каршеринга недоступны"
    }
    return userStatus
}

fun availableCars(user: User, cars: List<Car>): List<Car> {
    var res = mutableListOf<Car>()
    if (userStatus(user) == "Доступны все авто")
        res = cars as MutableList<Car>
  for(car in cars){
     if(userStatus(user) == "Доступны все авто кроме Audi и BMW")
          if(car.brand != "Audi" || car.brand != "BMW")
              res.add(car)
  }
    return  res
}
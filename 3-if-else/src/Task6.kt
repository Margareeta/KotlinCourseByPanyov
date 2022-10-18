/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
    val carMake: String = "Audi"
    val age: Int =22
    val drivingExp = 7

    val res: String = when {
        age >= 26 && drivingExp >= 6 -> "you can rent this car"
        age >=21 && drivingExp >=2 && carMake !="Audi" && carMake != "BMW"  -> "You can rent this car "
        else -> "You cannot rent a car"
    }
print(res)
}
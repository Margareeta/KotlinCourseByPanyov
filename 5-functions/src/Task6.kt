/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

Написать функцию, принимающую на вход марку авто(String), возраст и стаж пользователя и возвращающую
Boolean (доступно ему это авто или нет)

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/


fun main() {
    val age: Int = 25
    val exp = 6
    val brand: String ="Audi"
    if(canUseCarSharing(age, exp, brand))
        println("You can rent this car")
    else
        println("You can not rent this car")

}

fun canUseCarSharing(age: Int, exp: Int, brand: String): Boolean {
    val res: Boolean = when {
        age >= 26 && exp >= 6 -> true
        age >= 21 && exp >= 2 && brand != "Audi" && brand != "BMW" -> true
        else -> false
    }
    return res
}
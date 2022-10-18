/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
    val circle = Circle(4.6)
    println(circle.area(circle))
    println(circle.length(circle))

}
class Circle(val radius: Double){
    fun area(circle: Circle): Double{
        return Math.PI* circle.radius * circle.radius
    }
    fun length(circle: Circle) : Double{
        return 2*Math.PI*circle.radius
    }
}
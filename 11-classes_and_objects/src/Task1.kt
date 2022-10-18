/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота), инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height) и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {
    val rectangle = Rectangle(2, 5)
    println(rectangle.isSquare(rectangle))
    println(rectangle.perimeter(rectangle))
    println(rectangle.area(rectangle))

    val rectangle1 = Rectangle(2, 2)
    println(rectangle1.isSquare(rectangle1))
    println(rectangle.perimeter(rectangle1))
    println(rectangle.area(rectangle1))
}

class Rectangle(val width: Int, val height: Int) {

    fun isSquare(rectangle: Rectangle): Boolean {
        return rectangle.width == rectangle.height
    }

    fun perimeter(rectangle: Rectangle): Int {
        return 2 * (rectangle.width + rectangle.height)
    }

    fun area(rectangle: Rectangle): Int {
        return rectangle.height * rectangle.width
    }
}

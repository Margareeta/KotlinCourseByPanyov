/*
Для созданных в предыдущих задачах классов Rectangle и Round (нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String, которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

open class Figure(val color: String) {
    var x: Int = 0
    var y: Int = 0

    fun moveLeft(step: Int) {
        x -= step
    }

    fun moveRight(step: Int) {
        x += step
    }

    fun moveDown(step: Int) {
        y -= step
    }

    fun moveUp(step: Int) {
        y += step
    }
}

class Circle(val radius: Double, color: String) : Figure(color) {
    fun area(): Double {
        return Math.PI * radius * radius
    }

    fun length(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(val width: Int, val height: Int, color: String) : Figure(color) {
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
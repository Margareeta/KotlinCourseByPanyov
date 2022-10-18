/*
Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
оставив реализацию полиморфной для классов Rectangle и Round
Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

Для этой задачи есть видео с разбором.
*/
open abstract class Figure(val color: String) {
    abstract fun area(): Double
    abstract fun length(): Double
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
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun length(): Double {
        return 2 * Math.PI * radius
    }
}

class Rectangle(val width: Double, val height: Double, color: String) : Figure(color) {
    fun isSquare(): Boolean {
        return width == height
    }

    override fun length(): Double {
        return 2 * (width + height)
    }

    override fun area(): Double {
        return height * width
    }
}

class Triangle(val a: Double, val b: Double, val c: Double, color: String) : Figure(color) {
    override fun area(): Double {
        val p = length()/2
        return Math.sqrt(p * (p - a * b) * (p - b * c) * (p - c * a))
    }

    override fun length(): Double {
        return a + b + c
    }

}
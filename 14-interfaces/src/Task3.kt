
/*
Создайте коллекцию перемещаемых объектов (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
    val cat = Animal("Cat", 1, 3)
    val dog = Animal("Dog", 5, 5)
    val rectangle = Rectangle(2.0, 2.9, "blue")
    val triangle = Triangle( 4.3, 5.7, 6.9, "green")

    val movingObjects = mutableListOf<Movable>(cat, dog, rectangle, triangle)

    for (m in movingObjects){
        m.moveRight(10);
    }

}

class Rectangle(val width: Double, val height: Double, color: String) : Figure(color, 0, 0) {
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

class Triangle(val a: Double, val b: Double, val c: Double, color: String) : Figure(color, 0, 0) {
    override fun area(): Double {
        val p = length()/2
        return Math.sqrt(p * (p - a * b) * (p - b * c) * (p - c * a))
    }

    override fun length(): Double {
        return a + b + c
    }

}

/*
Написать функцию, которая возвращает большее из двух целых чисел.

Проверить работу написанной функции на примере каких-нибудь входных данных.
 */

fun main() {
    val a: Int = 44
    val b: Int = 666
    println(maxNum(a, b))
}

fun isMore(a: Int, b: Int): Boolean {
    return a > b
}

fun maxNum(a: Int, b: Int): Int {
    val res: Int = if (a > b)
        a
    else
        b
    return res
}



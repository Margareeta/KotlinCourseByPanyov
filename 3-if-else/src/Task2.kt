/* Для двух целых чисел вывести на экран «первое число больше» если первое больше, «второе число больше»
 если второе больше и вывести «числа равны», если они равны */
fun main(){
    val a: Int = 5
    val b: Int = 55
//    val areEqual: Boolean = a==b
//    val aIsMore: Boolean = a>b

//    if(areEqual)
//        println("числа равны")
//    else if(aIsMore)
//        println("первое число больше")
//    else
//        println("второе число больше")

    val result: String = when{
        a>b ->"первое число больше"
        a<b ->"второе число больше"
        else  ->"числа равны"
    }
    println(result)
}
import kotlin.math.pow
import kotlin.math.sqrt
fun main(){
    try {
        println("Введите сторону А")
        var a = readln()!!.toDouble()

        var s = a.pow(2.0) * sqrt(3.0) / 4

        var r = a * sqrt(3.0) / 6

        var R = a * sqrt(3.0) / 3

        println("Площадь треугольника:$s")
        println("Радиус вписанной окружности r равен:$r")
        println("Радиус описанной окружности R равен:$R")
    }catch (e:Exception){
        println("Не верно ")
    }
}
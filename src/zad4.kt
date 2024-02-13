import java.awt.Point

fun main(){
    try {

        var m1 = Point(1,1)
        var m2 = Point(4,4)
        var n1 = Point(2,2)
        var n2 = Point(3,3)

        var s = (m2.y - m1.y) / (m2.x - m1.x)
        var s2 = (n2.y - n1.y) / (n2.x - n1.x)
        when{
            (s == s2)-> println("Прямые, проходящие через точки M1 и M2, и через точки N1 и N2, параллельны.")
        }
        var in1 = m1.y - s * m1.x
        var in2 = n1.y - s2 * n1.x

        var inX = (in2 - in1) / (s - s2)
        var inY = s * inX + in1

        println("Прямые пересекаются в точке с координатами (${inX}, ${inY}).")

    }catch (e:Exception){
        println("Ошибка")
    }
}
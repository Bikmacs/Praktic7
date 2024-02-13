fun main(){
    try {
    println("Введите первую сторону")
        var a = readln()!!.toDouble()
    println("Введите вторую сторону")
        var b = readln()!!.toDouble()
    println("Введите третью сторону")
        var c = readln()!!.toDouble()

        var perimetr = (a + b + c)

        val square = perimetr *(perimetr - a) * (perimetr - b) * (perimetr - c)
        println("Плпщадь треугольник по формуле Герона:$square")
    }catch (e:Exception){
        println("не верно")
    }
}
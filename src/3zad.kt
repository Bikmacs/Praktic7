fun main(){
    try {
        println("введите трехзначное число")
        var number = readln()!!.toDouble()

        var a = number / 100
        var b = (number / 10) % 10
        var c = number % 10

        when{
            (2 * b == a + c)-> println("Цирфы $number образуют прогрессию")
            (2 * b != a+ c)-> println("Цирфы $number не образуют прогрессию")
        }
    }catch (e:Exception){
        println("Не верно")
    }
}
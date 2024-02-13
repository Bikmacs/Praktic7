import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    try
    {
        println("a")
        var x = readLine()!!.toDouble()
        var y = 0.0

        when(x in -1.0..2.0)
        {
            true ->
            {
                var y = sqrt(x.pow(2)+1)
                println(y)
            }
            false ->
            {
                var y = x - 1
                println(y)
            }


        }
    }catch (e:Exception){
        println("Не верно")
    }
}
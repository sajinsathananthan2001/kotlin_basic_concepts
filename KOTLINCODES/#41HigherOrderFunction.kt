data class Alien(var name : String, var points : Int)

fun main()
{
    var value = listOf<Int>(4,8,3,9,2,1)

    // var con : Consumer<Int> = object : Consumer<Int>
    // {
    //     override fun accept(t : Int)
    //     {
    //         println(t)
    //     }
    // }


    value.forEach( {println(it)} )
}



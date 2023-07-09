data class Alien(var name : String, var points : Int)

fun main()
{
    var value = listOf<Int>(4,8,3,9,2,1)

    var evens = value.filter{it%2==0} //for even values

    var doubleValues = evens.map { it*2 }


    evens.forEach( {println(it)} )

    println("............")

    doubleValues.forEach( {println(it)} )
}


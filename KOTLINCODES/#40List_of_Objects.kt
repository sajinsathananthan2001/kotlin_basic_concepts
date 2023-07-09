
data class Alien(var name : String, var rollNum : Int)

fun main()
{
    var values = listOf<Alien>(Alien("Sajin",20105046),Alien("Nijas",64050102))  

    for(i in values)
    {
        println(i)
    }

    println("...................................................")


    //for specific value
    var values2 : List<Alien> = listOf<Alien>(Alien("Sajin",20105046),Alien("Nijas",64050102))
    

    for(e in values2)
    {
        println(e.name)
    }

}
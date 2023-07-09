fun main()
{
    var str : String = "95A"

    var num : Int = 0

    try{
        num = str.toInt()
    }
    catch(e : NumberFormatException) // NumberFormatException is a type of exception to handle it 
    {
        println("Give proper Input")
    }
}
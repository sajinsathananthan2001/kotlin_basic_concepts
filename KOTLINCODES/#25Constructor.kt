//METHOD 1 ( Primary constructor )
class Human constructor(var n : String) //If we not mentioned "constructor" also it will work as a default constructor
                                        //Example( class Human (var n : String) ) <- you can also pass default value along with the constructor 
{
    var name : String = n
    fun think()
    {
        println("Kotlin is a Awesome language $name")
    }    
}


fun main()
{
    var sajin = Human("Sajin")
    sajin.think()
}
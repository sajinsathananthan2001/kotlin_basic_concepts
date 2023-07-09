//The constructor which is defined inside the class is known as the secondary constructor 


//METHOD 2 ( Secondary costructor )
class Human (var n : String) 
{
    var name : String = n
    var age : Int = 0

    constructor(age : Int, name : String) : this(name)       //we call any constructor but it is compelsory to cal the primary constructor 
    {
        this.age = age
    }

    fun think()
    {
        println("Kotlin is a Awesome language $name : $age")
    }    
}


fun main()
{
    var sajin = Human(20,"Sajin")
    sajin.think()
}
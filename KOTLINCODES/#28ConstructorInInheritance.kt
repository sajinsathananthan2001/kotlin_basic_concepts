open class Human(age : Int)     //defining the primary constructor by  "()"
{
    init    //its a primary constructor block
    {
        println("This is primary constructor of 'Human class'  with age $age")
    }    
    open fun think()
    {
        println("Im from Human class and think functon")
    }
}

class Alien(age : Int) : Human(age)
{
    init
    {
        println("This is primary constructor of 'Alien class' ")
    }
    fun working()
    {
        println("Im fom Alien class and working function")
    }

    //we are overrideing the think function from Human class
    override fun think()
    {
        println("This is overrided think functon from Human class by Alien class")
    }
}

fun main()
{
    var sajin = Alien(20)
    sajin.think()
    sajin.working()
}
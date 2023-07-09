
open class Human
{
    open fun think()
    {
        println("Im from Human class and think functon")
    }
}

class Alien : Human()
{
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
    var sajin = Alien()
    sajin.think()
    sajin.working()
}
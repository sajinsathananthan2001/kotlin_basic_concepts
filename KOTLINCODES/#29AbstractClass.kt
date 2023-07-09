abstract class Human    
{
    
    abstract fun think()     //An 'abstract' function should be inside the abstract class only 
    
    fun talk()
    {
        println("Talking...")
    }
}

class Doctor : Human()
{
    override fun think()
    {
        println("Critical thinking")
    }
}

class Alien : Human()
{
        //we are overrideing the think function from Human class
    override fun think()
    {
        println("This is overrided think functon from Human class by Alien class")
    }
}

fun main()
{
    var sajin : Human = Alien()  //here we are using Human also for simular to JAVA 
    sajin.talk()
    sajin.think()
}
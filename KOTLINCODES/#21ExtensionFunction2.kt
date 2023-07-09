class Alien
{
    var skills : String? = null

    fun show()
    {
        println(skills)
    }
}

fun main()
{
    var a1 = Alien()
    a1.skills = "JAVA"
    a1.show()

    var a2 = Alien()
    a2.skills = "KOTLIN"
    a2.show()

    var a3 = a1 plus a2   //here we using plus keyword 
    a3.show()
    
}

infix fun Alien.plus(a : Alien) : Alien  //by adding infix we can use plus keyword to use the extension function
{
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}
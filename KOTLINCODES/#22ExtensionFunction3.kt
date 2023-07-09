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

    var a3 = a1 + a2  //Here we are using '+' operator 
    a3.show()
    
}

operator infix fun Alien.plus(a : Alien) : Alien  //here we are adding "operator" into the function to work + operator in code
{
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}
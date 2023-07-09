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

    var a3 = a1.plus(a2)
    a3.show()
    
}

fun Alien.plus(a : Alien) : Alien
{
    var newAlien = Alien()
    newAlien.skills = this.skills + " " + a.skills
    return newAlien
}
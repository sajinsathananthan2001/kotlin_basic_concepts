class A
{
    companion object
    {
        @JvmStatic        //by adding '@JvmStatic' you can call the show() function in java program also this can acces only o n companion obj
        fun show()
        {
            println("Hello")
        }
    }
}

fun main()
{
    A.show()
}
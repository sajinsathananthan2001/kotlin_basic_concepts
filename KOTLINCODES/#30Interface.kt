interface A
{
    fun show()

    fun abc()
    {
        println("In abc in A")
    }
}
interface B
{
    fun display()
}

class C : A, B
{
    override fun show()
    {
        println("In show")
    }
    override fun display()
    {
        println("In display")
    }
    override fun abc()
    {
        super<A>.abc()
    }
}

fun main()
{
    var obj = C()
    obj.show()
    obj.display()

    obj.abc()
}
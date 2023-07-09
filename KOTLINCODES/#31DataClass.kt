
// 1.Every class need a toString()
// 2.equals & hashCode
// 3.copy method creating


data class Laptop(val brand : String, val price : Int)   //here we are adding 'data' so we can use copy method
{
    fun show()
    {
        println("Awesome Machine...")
    }
}

fun main()
{
    var lap1 = Laptop("Dell", 100000)
    var lap2 = Laptop("Dell",100000)

    var lap3 = lap1.copy()   //you can change the price by 'lap1.copry(price = 22000)'

    println(lap1.equals(lap2))  //if no data keyword is used it cant able to compare those neither it will compare the hashCode and return false

    println(lap3)
}
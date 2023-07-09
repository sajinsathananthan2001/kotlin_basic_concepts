


//METHOD 1
fun fact(num : Int) : Int
{
    if(num == 0)
        return 1
    else
        return num * fact(num - 1)
}


/*But this wont work in case of big number because 
int can handle specific range of numbers only */

//METHOD 2
fun factorial(num2 : Int) : Int                                     //Here the code wont run because he we need to import java files
{                                                                      //it is not possible here 
    if(num2 == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num2 * factorial(num2 - BigInteger.ONE)
}


fun main()
{
    var num = 7
    var num2 = BigInteger("70")

    println(fact(num))

    println(factorial(num2))


}
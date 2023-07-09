fun main(){
    var finalAmt = calcIntrest(1000,0.05)

    var finalAmt2 = calcAmount(amt = 55, intrest = 0.06)//other than the first method we are using NAME additionally thats it 

    println("The final Amount after intrest is $finalAmt")
    println("The final Amount 2 after intrest is $finalAmt2")
}


//Here we are giving default parameter into the function 
//if we dosent give any input it will use that default parameter

@JvmOverloads  //this overload is used for java to acces pass one parrameter if it not use we can pass only one parrameter in JAVA 
fun calcIntrest(amt : Int, intrest : Double = 0.04) : Int 
{
    var result = (amt + amt*intrest).toInt()
    return result
}


//This is the new concept insted of method overloading in Java  



//Named Parameters
@JvmOverloads 
fun calcAmount(amt : Int, intrest : Double = 0.04) : Int 
{
    var result = (amt + amt*intrest).toInt()
    return result
}

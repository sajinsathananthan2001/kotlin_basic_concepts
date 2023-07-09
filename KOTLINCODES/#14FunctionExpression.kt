fun main(){
    add(45,55)
    var result1 = sub(100,50)
    var result2 = multi(3,11)
    var result3 = max(100,999)

    println("The Sub of two number is $result1")
    println("The Multi of two number is $result2")
    println("The max of two number is $result3")

}


//function type1
fun add(x : Int , y : Int)
{
    println("The Addition of two number is ${x+y}")
}

//function type2
fun sub(a : Int , b : Int) : Int
{
    return a-b
}

//function type3 (its a inlined function)
fun multi(c : Int , d : Int) : Int = c*d 

//function type4
fun max(a : Int , b : Int) : Int = if(a>b) a else b

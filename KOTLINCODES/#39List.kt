
//this is updated version of Array 

fun main()
{
    var values = listOf<Int>(3,3,5,7,4,7,3,21,6,0,9)  //this is only a readable list here we cant modify the data for modi we use mutableList

    for(i in values)
    {
        println(i)
    }

    println("-------------------")

    println(values.indexOf(21))   //give the index number in that value
    println(values.get(2))        //give the value in that index number

    println("-------------------")


    var values2 : MutableList<Int> = mutableListOf<Int>(1,2,4,5,6,7,8,9)  //mutableList

    //now we can mofify or add the datas in this lists
    values2.add(56)   //this can use for add data 
    values2.add(2,3)  //2 is index number 3 is value

    for(o in values2)
    {
        println(o)
    }
}
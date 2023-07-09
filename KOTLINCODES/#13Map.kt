

fun main(){
    var aliens = TreeMap<String,Int>()
    aliens["SAJIN"]= 558
    aliens["NIJAS"]= 947

    for((name,age) in aliens)
    {
        println("$name : $age")
    }
}

/*Here we get the output of :
    SAJIN : 558
    NIJAS : 947
 */

 /*
 Here we cant import java package to run the TreeMap so we are just hardcore the output */
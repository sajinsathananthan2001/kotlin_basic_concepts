fun main(){
    val num : Int = 2

    val num2 : Int = 1

    when(num){

        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Please give the proper input")

    }

    var str: String = when(num2){
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        else -> "Greater than Three"

    }

    println("The given str is $str")

} 
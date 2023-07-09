class ExampleClassKt {
    var name: String = ""
    var rollNum: String = ""
}

//here we taking class inside the program because still now we not learned about public class

fun main(){
    var num1: Int = 3
    var num2: Int = 7

    var result: Int = num1+num2

    println("The addition of $num1 and $num2 is $result")


    var x = ExampleClassKt()

    x.name = "SAJIN"
    x.rollNum = "20105046 A"

    println("His name is ${x.name} and his roll number is ${x.rollNum}")
    println(x.rollNum)

}
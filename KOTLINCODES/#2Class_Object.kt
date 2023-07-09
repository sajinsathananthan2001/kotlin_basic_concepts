class Bike{

    var model : String = ""
    var color : String = ""
    var topSpeed : Int = 0

}

//creating the obj 

fun main(){
    var dominar = Bike()
    dominar.model = "Dominar 400"
    dominar.color = "Blue"
    dominar.topSpeed = 173

    println(dominar.model)
    println(dominar.color)
    println(dominar.topSpeed)


    var color_of_bike : String = dominar.color

    println("the name of the bike is ${dominar.model}")
    println("The color of the bike is $color_of_bike") //other than object you can use like this 
}

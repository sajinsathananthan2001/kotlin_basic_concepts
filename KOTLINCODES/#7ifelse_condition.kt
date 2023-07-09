fun main(){
    var x: Int = 48
    var y: Int = 99

    var result: Int = 0
    var result2: Int = 0

    if(x>y)
        result = x
    else
        result = y

    println(result)


    result2 = if(x<y)
        x
    else
        y
    println(result2)

}
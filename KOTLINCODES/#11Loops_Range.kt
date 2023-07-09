fun main(){
    var x: Int = 0

    
    while(x < 5){
        println(x)
        x++
    }

    var nums = 1..5
    
    for(a in nums)
        println(a)


    var y = 1..10

    for (b in y step 2){
        println(b)
    }

    var h = 18 downTo 1 

    for(a in h){
        println(a)
    }
}
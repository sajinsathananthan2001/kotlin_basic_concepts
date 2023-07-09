fun main(){

    //this is list and the map
    
    var nums = listOf(1,2,3,4,5,6,)
    
    //method1
    println(nums[2])//using index number

    //method2
    for(x in nums) //using for loop
    println(x)

    for((i,e) in nums.withIndex())
    {
        println("The index and element is $i : $e")
    }

}
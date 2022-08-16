package Functions

fun main(){
   sum()
    sum(
        4,
        5
    )
    println(mul(20,10))
}

fun sum(){
    var x:Int = 10
    var y:Int = 10
    println(x+y)
}
fun sum(x:Int, y:Int){
    println (x+y)
}
// return function
fun mul(x:Int, y: Int):Int{
    return (x*y)
}
fun main()
{
    var x:Int=10;
    var y:Int=20;

    if(x>y) {
        if (x!=y) {
            println("false")
        }
    } else {
        println("y is greater then x")
    }

    val result = if(x<y){
       true
    }else{
        false
    }
    println(result)


}
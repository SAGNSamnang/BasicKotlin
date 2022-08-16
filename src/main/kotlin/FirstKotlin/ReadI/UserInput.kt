package FirstKotlin.ReadI

fun main(){
    println("Enter number : ")
    var a = readln();

    println("Enter number : ")
    var b = readln();

    println("Maximum of two number is ${max(a.toInt(), b.toInt())}")
}

fun max(a:Int, b:Int):Int{
    var maximum = if(a>b){
        println("$a is greater than $b")
        a
    }
    else {
        println("$b is greater than $a")
        b
    }
    return maximum;
}


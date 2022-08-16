package Array

fun main(){
    var list = arrayOf<Int>(4,4,20,30,10,50)

    var dis = list.distinct()
    for (i in dis){
        println(i)
    }
    println("Minimum number is ${list.min()}")

    println("Maximum number is ${list.max()}")

    println("Sort ${list.sorted().distinct()}")
    println("Sort ${list.sortedDescending().distinct()}")

    println(list.last())
    println(list.lastIndex)

    println("Using aslist : ${list.asList()}")

    var c = list.clone()
    for(i in c){
        println(i)
    }

}
package Collection

fun main(){
    val list = listOf("Apple",1,3,4);
    println(list.first())
    for(x in list){
        println(x);
    }
    val map = mapOf(1 to "Moon", "s" to "Sun", 7 to "Me")
    println(map[1])

    val s = setOf<Int>(1,2,3,4,4,5)
    for(x in s){
        println(x)
    }
}
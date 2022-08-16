package ForLoop

fun main(){

//    for(a in 10 downTo 1)
//        print(a)
//
//    for(x in 1 .. 20 step 3){
//        println(x)
//    }
//
//    for(x in 30 downTo 1 step 10)
//        println(x)

    val list = listOf<String>("Hello", "Greeting", "Say Hi", "Hey")
    println(list.get(0))
    for(l in list){
        println(l)
    }
}
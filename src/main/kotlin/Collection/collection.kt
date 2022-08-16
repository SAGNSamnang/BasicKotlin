package Collection

fun main(){
    val array=Array(10){
        5
    }
    array[0] = 10
    array[1] = 11
    array[9] = 40


    for (a in array){
        println(a)
    }
}
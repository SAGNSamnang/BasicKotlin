package Array

fun main(){
    val list = arrayOf<String>("Name", "Name", "Gender")
    list[1] = "Hello"
    val dis = list.distinct()
    for(i in dis){
        println(i)
    }
}
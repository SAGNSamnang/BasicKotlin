import java.util.Scanner

fun main(args: Array<String>) {

    var name = "Name";
    println(name)
    println(name::class.java) // print type

    val input=Scanner(System.`in`)
    print("Enter name: ")
    var n:Int= input.nextInt()

    println("Name : $n")

}
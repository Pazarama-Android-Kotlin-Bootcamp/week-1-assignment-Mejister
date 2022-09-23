import java.util.Scanner


fun aVeryBigSum(ar: Array<Long>)= ar.sum()
fun main(args:Array<String>) {
    val input = Scanner(System.`in`)
    val count = input.nextLine().trim().toInt()
    val ar = input.nextLine().split(" ").map { it.trim().toLong() }.toTypedArray()
    val result = aVeryBigSum(ar)
    println(result)
}
fun main() {
    println("bir sayi giriniz:")
    var num:Int= readln().toLong().toInt()
    var result:Long=1
    for(i in 1..num)
    result *= i.toLong()
    println(result)
}

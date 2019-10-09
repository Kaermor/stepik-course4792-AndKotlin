fun calcChairs(bugs:Int): Int{
    return bugs + bugs/2
}

fun main(args: Array<String>) {
    val bugs: Int = readLine()!!.toInt()

//    val bugs: Int = xs.toInt()
//    val chairs:Int = calcChairs(bugs)
//    val sum:Int = sum_user.toInt()

//    val tax:Double = calcTax(sum)
    println(calcChairs(bugs))
}
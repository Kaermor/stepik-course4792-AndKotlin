fun calcBugMoneyValue(dayNumber: Int, bugRank: Int, cashAmount: Int): Int {
    return (dayNumber*bugRank + 42)*cashAmount
}

fun main(args: Array<String>) {
    val (dayNumber:Int, bugRank:Int, cashAmount:Int) = readLine()!!.split(' ').map(String::toInt)

    println(calcBugMoneyValue(dayNumber, bugRank, cashAmount))
//    println("${dayNumber*2} ${bugRank*2} ${cashAmount*2}")
}
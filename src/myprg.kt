fun calculateEvenDigits(input:String): Int{
    var sum = 0
    println(input)
    for (c:Char in input){
        //println("${c} ${c.toInt()-'0'.toInt()} ${c.toInt()%2}")

        if ((c.toInt()-'0'.toInt())%2 == 0) sum+=c.toInt()-'0'.toInt()
    }
    return sum
}


fun main(args: Array<String>){
    val input:String = readLine()!!

    println(calculateEvenDigits(input))
}
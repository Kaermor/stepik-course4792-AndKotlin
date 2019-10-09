fun calculateEvenDigits(input:String): Int{
    var sum = 0
    println(input)
    for (c in input){
        println("${c} ${c.toInt()} ${c.toInt()%2}")

        if (c.toInt()%2 == 0){
            sum+=c.toInt()
        }
    }
    return sum
}


fun main(args: Array<String>){
    val input:String = readLine()!!

    println(calculateEvenDigits(input))
}
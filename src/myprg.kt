fun calculateBugMentions(input:List<String>): Int{
    var sum:Int = 0
    for (el in input){
        if(el == "BUG") sum++
    }
    return sum
}


fun main(args: Array<String>){
    val input:List<String> = readLine()!!.split(' ')
//    println(input)

    println(calculateBugMentions(input))
}
fun main(args: Array<String>){
    val sstr:String? = readLine()
    var digit: Int
    when(sstr){
        "one" -> digit=1
        "two" -> digit=2
        "three" -> digit=3
        "four" -> digit=4
        "five" -> digit=5
        "zero" -> digit=0
        else -> {
            println("Wrong string!")
            return
        }
    }
    println(digit)
}
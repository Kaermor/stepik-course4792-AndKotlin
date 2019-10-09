fun getYearEra(year: Int): String{
    var tt = "Unix"
    when{
        year < 1970 -> tt = "before"
        year == 1970 -> tt = "equals"
        year in 1971..2000 -> tt = "after (XX century)"
        year in 2001..2100 -> tt = "after (XXI century)"
        year > 2100 -> tt = "distant future"
    }
    return tt
//    return "Forever Unix"

}

fun main(args: Array<String>){
    val year:Int = readLine()!!.toInt()
    println(getYearEra(year))
}
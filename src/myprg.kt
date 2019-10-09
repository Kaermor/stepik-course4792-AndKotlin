fun getYearEra(year: Int): String{
    return when{
        year < 1970 -> "before"
        year == 1970 -> "equals"
        year in 1971..2000 -> "after (XX century)"
        year in 2001..2100 -> "after (XXI century)"
        else -> "distant future"
    }
//    return "Forever Unix"

}

fun main(args: Array<String>){
    val year:Int = readLine()!!.toInt()
    println(getYearEra(year))
}
fun calculateWordStat(input:String): String{
    // enter your function code here
    val lst:List<String> = input.split(" ")
    val st = lst.toSet()
    var ns:MutableList<Int> = mutableListOf()
    for(s:String in st){
      ns.add(lst.count { it == s })
    }
    return st.toList()[ns.indexOf(ns.max())]
}


fun main(args: Array<String>){
    val input: String = readLine()!!.toString()
    println("MaxWord= ${calculateWordStat(input)}")

}
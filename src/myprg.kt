class NibirunianClass {
    public var namePlate: String = ""
    //public var name: String = ""
    public fun createNamePlate (name:String){
        this.namePlate = "Live long and prosper, ${name}"
        return
    }
}

//fun calculateBugMentions(input:List<String>): Int{
//    var sum:Int = 0
//    for (el in input){
//        if(el == "BUG") sum++
//    }
//    return sum
//}
//
//
//fun main(args: Array<String>){
//    val input:List<String> = readLine()!!.split(' ')
////    println(input)
//
//    println(calculateBugMentions(input))
//}
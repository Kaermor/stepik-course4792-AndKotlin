fun getCubeList(n:Int): List<Int>{
    // enter your function code here
    return List(n, {i -> i*i*i})
}


fun main(args: Array<String>){
    val n: Int = readLine()!!.toInt()
    println(getCubeList(n))

}
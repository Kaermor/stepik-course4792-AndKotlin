class SugarStorage(var volume:Int=0){
    fun decreaseSugar(v:Int){
        if (v >= 0){
            volume = if (v <= volume) (volume - v) else 0
        }
    }
    fun increaseSugar(v:Int){
        if (v >= 0){
            volume += v
        }
    }

}


fun main(args: Array<String>){

    var ss:SugarStorage = SugarStorage()
    println("volume = ${ss.volume}")
    ss.increaseSugar(10)
    println("volume i+10 = ${ss.volume}")
    ss.increaseSugar(100)
    println("volume i+100 = ${ss.volume}")
    ss.increaseSugar(0)
    println("volume i+0 = ${ss.volume}")
    ss.increaseSugar(-10)
    println("volume i-10 = ${ss.volume}")
    ss.decreaseSugar(10)
    println("volume d+10 = ${ss.volume}")
    ss.decreaseSugar(0)
    println("volume d+0 = ${ss.volume}")
    ss.decreaseSugar(-10)
    println("volume d-10 = ${ss.volume}")
    ss.decreaseSugar(200)
    println("volume d+200 = ${ss.volume}")


}
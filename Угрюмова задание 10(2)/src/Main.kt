fun main(){
    try {
        var answer: String
        var p: Boolean = true
        var price: Double
        var s1: Double
        println("Tele2")
        val tele2 = Tele2("Tele2", 10.0, 300.0, true)
        println(tele2.Info())
        println("Motiv")
        while (true) {
            println("есть ли оплата за каждое соединение?")
            answer = readLine().toString()
            if (answer == "да") {
                p = true
                break
            }
            if (answer == "нет") {
                p = false
                break
            }
        }
        val motiv = Motiv("Motiv", 8.0, 100.0, p)
        println(motiv.Output())
        println("Beeline")
        while(true){
            println("введите цену минуты разговора")
            price = readLine()!!.toDouble()
            if(price>0){
                break
            }
        }
        while(true){
            println("введите размеры площади покрытия")
            s1 = readLine()!!.toDouble()
            if(s1>0){
                break
            }
        }
        while (true) {
            println("есть ли оплата за каждое соединение?")
            answer = readLine().toString()
            if (answer == "да") {
                p = true
                break
            }
            if (answer == "нет") {
                p = false
                break
            }
        }
        val beeline = Beeline("Beeline", price, s1, p)
        println(beeline.Output())
    }
    catch(e: Exception){
        println("ошибка")
    }
}
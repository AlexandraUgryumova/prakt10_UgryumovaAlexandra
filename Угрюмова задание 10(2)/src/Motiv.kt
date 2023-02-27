import kotlin.math.roundToInt
class Motiv(name: String, priceMinet: Double, s: Double, public var p: Boolean): Operators(name, priceMinet, s) {
    constructor(name: String, priceMinet: Double, s: Double): this(name, priceMinet, s, true)
    var qt: Double = 0.0
    override fun Q(): Double{
        if(p == true){
            return 0.7*super.Q()
        }
        else{
            return 1.5*super.Q()
        }
    }
    override fun Output(): String{
        return "Оператор: $name\nплощадь покрытия: $s\nстоимость минуты: $priceMinet\nстоимость разговора: ${Q()}"
    }
}
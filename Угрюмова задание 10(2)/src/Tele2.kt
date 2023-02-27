import kotlin.math.roundToInt
class Tele2(override val name: String, override val priceMinet: Double, override val s: Double, private val p:Boolean): Operator {
    override fun Q(): Double{
        if(p == true){
            return 0.7*super.Q()
        }
        else{
            return 1.5*super.Q()
        }
    }
    override fun Info(): String{
        return "Оператор: $name\nплощадь покрытия: $s\nстоимость минуты: $priceMinet\nстоимость разговора: ${Q()}"
    }
}
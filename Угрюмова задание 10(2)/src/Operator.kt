interface Operator {
    val name: String
    val priceMinet: Double
    val s: Double
    fun Q(): Double{
        return (100*s)/priceMinet
    }
    fun Info(): String{
        return "Оператор: $name\nплощадь покрытия: $s\nстоимость минуты: $priceMinet\nстоимость разговора: ${Q()}"
    }
}
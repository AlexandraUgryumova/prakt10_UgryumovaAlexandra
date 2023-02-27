abstract class Operators(val name: String, val priceMinet: Double, val s: Double) {
    constructor(priceMinet: Double, s: Double) : this(" ",priceMinet, s)
    open fun Q():Double{
        return (100*s)/priceMinet
    }
    abstract fun Output(): String
}
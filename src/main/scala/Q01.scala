object Q01 {
  def produceInterest(depositAmount:Float):Float = depositAmount match{
    case a if a <= 200000.00f => a * 0.02f
    case a if a <= 2000000.00f => a * 0.04f
    case a if a <= 20000000.00f => a * 0.035f
    case a => a * 0.065f
  }
  def main(arg:Array[String]): Unit ={
    println(produceInterest(21000))
    println(produceInterest(245070))
    println(produceInterest(4575000))
    println(produceInterest(67845900))
  }
}

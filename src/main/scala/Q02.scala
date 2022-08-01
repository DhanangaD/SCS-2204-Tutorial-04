object Q02 {

  def checkNumbers(input:Int):Unit = input match {
    case a if a <= 0 => println("Negative/Zero")
    case a if a % 2 == 0 => println("Even")
    case _ => println("Odd")
  }

  def main(args:Array[String]): Unit ={
    print("ENTER YOUR NUMBER : ")
    val number = scala.io.StdIn.readInt()
    checkNumbers(number)
  }
}

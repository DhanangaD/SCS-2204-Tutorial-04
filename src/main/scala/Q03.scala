object Q03 {
  def toUpper(input1: String): String = {
    input1.toUpperCase()
  }

  def toLower(input2: String): String = {
    input2.toLowerCase()
  }

  def formatNames(name: String)(indexes: Int*)(function: String => String): String = {

    var convertName = ""
    var i = 0

    if (indexes.isEmpty) {
      return function(name)
    }
    else {
      while (i < name.length) {
        if (indexes.contains(i)) {
          convertName = convertName + function(name.charAt(i).toString)
        }
        else {
          convertName = convertName + name.charAt(i).toString
        }
        i = i + 1
      }
    }
    convertName
  }

  def main(args:Array[String]): Unit ={
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toLower))
    println(formatNames("Kumara")(5)(toUpper))
  }
}

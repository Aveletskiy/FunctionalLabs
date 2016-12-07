package main.scala

object lab5 {

  /**3.1**/
  def selfCountInvokes(): () => Int = {
    var count: Int = 0
    def callCounter(): Int = {
      count += 1
      count
    }
    callCounter
  }

  /**3.2.2**/
  def convertDecToNumeral(dec: Int, n: Int): String = {
    def numeralToString(i: Int): String = {
      val s = i match {
        case 10 => "A"
        case 11 => "B"
        case 12 => "C"
        case 13 => "D"
        case 14 => "E"
        case 15 => "F"
        case _ => i + ""
      }
      s
    }
    def convertDecToBinary(_dec: Int, base: Int, s: String): String = {
      var str = s
      if (base > _dec) {
        str = numeralToString(_dec) + str
        str
      }
      else {
        str = numeralToString(_dec % base) + str
        convertDecToBinary(_dec / base, base, str)
      }
    }
    convertDecToBinary(dec, n, "")
  }

  /**3.3**/
  def closureListGen(z: Int)(length: Int): List[Int] = {
    val r = scala.util.Random
    def closureListGen(length: Int, acc: List[Int]): List[Int] = {
      if (length == 0) acc
      else {
        val element = z + (r.nextInt() % 6)
        closureListGen(length - 1, element :: acc)
      }
    }
    closureListGen(length, Nil)
  }

  def main(args: Array[String]): Unit = {
    val callCounter = selfCountInvokes()
    callCounter()
    callCounter()
    println(callCounter())
    val func2 = convertDecToNumeral(_: Int, 2)
    println(func2(111))
    val func16 = convertDecToNumeral(_: Int, 16)
    println(func16(29))
    val listBuilderWithOneMedium = closureListGen(1)(_)
    println(listBuilderWithOneMedium(10))
  }
}

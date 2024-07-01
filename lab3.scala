// 01 
def rs(s: String): String = {
    if (s.isEmpty) ""
    else rs(s.tail) + s.head
  }

// 02
def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
}
val input = List("Scala", "programming", "is", "fun", "and", "productive")


// 03
 def calculateMean(num1: Double, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    // Round to two decimal places using basic arithmetic
    Math.round(mean * 100.0) / 100.0
  } 


// 04
 def sumOfEvens(numbers: List[Int]): Int = {
  numbers.filter(_ % 2 == 0).sum
  }

  val inputn=List(1,2,3,4,5,6)
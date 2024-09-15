// 01 
def reversestring(s: String): String = {
    if (s.isEmpty) ""
    else reversestring(s.tail) + s.head
  }

// 02
def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
}
val input = List("Scala", "programming", "is", "ucsc", "and", "computing")


// 03
 def calculateMean(num1: Int, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    // Round to two decimal places
    Math.round(mean * 100.0) / 100.0
  } 



 def sumOfEvens(numbers: List[Int]): Int = {
  numbers.filter(_ % 2 == 0).sum
  }

  val inputn=List(1,2,3,4,5,6)




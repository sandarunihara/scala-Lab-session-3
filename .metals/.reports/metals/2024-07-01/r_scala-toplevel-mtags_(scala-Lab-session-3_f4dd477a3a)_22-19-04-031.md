error id: file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala:[12..13) in Input.VirtualFile("file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala", "// 01 
def (s: String): String = {
    if (s.isEmpty) ""
    else rs(s.tail) + s.head
  }

// 02
def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
}
val input = List("Scala", "programming", "is", "ucsc", "and", "computing")


// 03
 def calculateMean(num1: Double, num2: Int): Double = {
    val mean = (num1 + num2) / 2.0
    // Round to two decimal places
    Math.round(mean * 100.0) / 100.0
  } 


// 04
 def sumOfEvens(numbers: List[Int]): Int = {
  numbers.filter(_ % 2 == 0).sum
  }

  val inputn=List(1,2,3,4,5,6)



")
file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala
file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala:2: error: expected identifier; obtained lparen
def (s: String): String = {
    ^
#### Short summary: 

expected identifier; obtained lparen
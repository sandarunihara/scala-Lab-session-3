error id: file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala:[301..304) in Input.VirtualFile("file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala", "// 01 
def rs(s: String): String = {
    if (s.isEmpty) ""
    else rs(s.tail) + s.head
  }

// 02
def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
}
val input = List("Scala", "programming", "is", "fun", "and", "productive")

def 



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

def sumOfEven(numbers: List[Int]): Int ={
    numbers match{
      case Nil => 0
      case head::tail=> if(head%2==0) head+sumOfEven(tail)
      else sumOfEven(tail)
    }
  }")
file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala
file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala:18: error: expected identifier; obtained def
 def calculateMean(num1: Double, num2: Int): Double = {
 ^
#### Short summary: 

expected identifier; obtained def
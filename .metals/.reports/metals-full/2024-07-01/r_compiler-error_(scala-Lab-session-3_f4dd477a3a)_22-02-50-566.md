file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala
### java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/User/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/List.scala

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 644
uri: file:///E:/2nd%20Year/Semester%201/FC/practicals/sessions%203/scala-Lab-session-3/lab3.scala
text:
```scala
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
    // Round to two decimal places
    Math.round(mean * 100.0) / 100.0
  } 


// 04
 def sumOfEvens(numbers: List[Int]): Int = {
  numbers.filter(_ % 2 == 0).sum
  }

  val inputn=List(1,2,3,4,5,6)

  def sumeven(number:List[Int]):Int={
    number m@@
  }


```



#### Error stacktrace:

```
java.base/sun.nio.fs.WindowsPathParser.normalize(WindowsPathParser.java:182)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:153)
	java.base/sun.nio.fs.WindowsPathParser.parse(WindowsPathParser.java:77)
	java.base/sun.nio.fs.WindowsPath.parse(WindowsPath.java:92)
	java.base/sun.nio.fs.WindowsFileSystem.getPath(WindowsFileSystem.java:232)
	java.base/java.nio.file.Path.of(Path.java:147)
	java.base/java.nio.file.Paths.get(Paths.java:69)
	scala.meta.io.AbsolutePath$.apply(AbsolutePath.scala:58)
	scala.meta.internal.metals.MetalsSymbolSearch.$anonfun$definitionSourceToplevels$2(MetalsSymbolSearch.scala:70)
	scala.Option.map(Option.scala:242)
	scala.meta.internal.metals.MetalsSymbolSearch.definitionSourceToplevels(MetalsSymbolSearch.scala:69)
	dotty.tools.pc.completions.CaseKeywordCompletion$.sortSubclasses(MatchCaseCompletions.scala:326)
	dotty.tools.pc.completions.CaseKeywordCompletion$.matchContribute(MatchCaseCompletions.scala:276)
	dotty.tools.pc.completions.Completions.advancedCompletions(Completions.scala:307)
	dotty.tools.pc.completions.Completions.completions(Completions.scala:109)
	dotty.tools.pc.completions.CompletionProvider.completions(CompletionProvider.scala:90)
	dotty.tools.pc.ScalaPresentationCompiler.complete$$anonfun$1(ScalaPresentationCompiler.scala:146)
```
#### Short summary: 

java.nio.file.InvalidPathException: Illegal char <:> at index 3: jar:file:///C:/Users/User/AppData/Local/Coursier/cache/v1/https/repo1.maven.org/maven2/org/scala-lang/scala-library/2.13.12/scala-library-2.13.12-sources.jar!/scala/collection/immutable/List.scala
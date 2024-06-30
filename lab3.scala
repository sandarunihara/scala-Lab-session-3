// 01 
def rs(s: String): String = {
    if (s.isEmpty) ""
    else rs(s.tail) + s.head
  }

// 02
def filterStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
}
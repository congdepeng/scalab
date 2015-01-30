package lang.keywords

import scala.util.control.Breaks

object Assert {

  def main(args: Array[String]) {
    assert(!listValuesAllValid(null))
    assert(listValuesAllValid(List("")))
    assert(!listValuesAllValid(List("", null)))
    listValuesAllValid(List("1", "2", null, "3"))
  }


  def listValuesAllValid(values: List[String]): Boolean = {
    if (values == null) {
      false
    } else {
      var hadConfigValues = true
      val loop = new Breaks
      loop.breakable {
        for (value <- values) {
          if (value == null) {
            hadConfigValues = false
            loop.break()
          }
        }
      }
      hadConfigValues
    }
  }


}

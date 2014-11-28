package lang.process.function

object LambdaByUnderscoreMain extends App {

  val numbers = Array(1, 2, 3, 4, 5)
  //_+_ is lambda function shorthand, full definition is (a:Int, b:Int) => a + b
  //reduceLeft is high-level function
  val sum = numbers.reduceLeft[Int](_ + _)
  println(sum)
  private val full_definition: (Int, Int) => Int = (a: Int, b: Int) => a + b
  private val full: Int = numbers.reduceLeft(full_definition)
  assert(sum == full)

  val multiply = numbers.reduceLeft[Int](_ * _)
  println(multiply)

  private val fun_add2s: (String, String) => String = _ + _
  println(fun_add2s)

  // param can be different
  private val fun_add1i1s: (Int, String) => Int = _ + _.asInstanceOf[Int]
  println(fun_add1i1s)

  // param number keep going
  private val fun_add3: (Int, Int, Int) => Int = _ + _ + _
  println(fun_add3)


//var String a = ""
//def String addStr(String a, String b){}
  def addStr(a: String, b: String): String = {
    (a.toInt + b.toInt).toString
  }

  val strings = Array("1", "2", "3", "4", "5")
  val sSum: String = strings.reduceLeft[String](addStr)
  println(sSum.toInt)


  // OUTPUT:
  //  15
  //  120
  //  <function2>
  //  <function3>
  //  15
}

package lang.datatype.simple.number.integer

object IntMain extends App {

  private val clazz: Class[_ <: Int] = 1000.getClass
  println(clazz)
  println(Int.MaxValue)
  println(Int.MinValue)

  //literals
  private val i: Int = 100

  //static create
  private val box: Integer = Int.box(100)

  //convert
  private val int2double: Double = Int.int2double(11)
  private val string: String = Int.toString()
  println(string)
  println(i.toString)


}

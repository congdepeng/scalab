package lang.datatype.integer

import java.lang


object LongMain extends App{

  private val box1: Long = Long.box(1)
   private val clazz: Class[_ <: Long] = box1.getClass
  println(clazz)
  println(Long.MaxValue)
  println(Long.MinValue)

  //literals
  private val l: Long = 100

  //static create
   private val box: Long = Long.box(100)

  //convert
  private val string: String = Long.toString()
  println(string)
  println(l.toString)


}

package lang.datatype.integer

object ByteMain extends App {

  private val clazz: Class[_] = Byte.getClass
  println(clazz)

//  final val MinValue = java.lang.Byte.MIN_VALUE = -128
//  final val MaxValue = java.lang.Byte.MAX_VALUE = 127
  private val min: Byte = Byte.MinValue
  private val max: Byte = Byte.MaxValue

  printf("%d - %d", min, max)

  println(java.lang.Byte.MIN_VALUE.getClass)
  println(127.getClass)



}

package lang.datatype.simple.number.integer

object ShortMain extends App {

  private val clazz: Class[_] = Short.getClass
  println(clazz)

  private val min: Short = Short.MinValue
  private val max: Short = Short.MaxValue

  printf("%d - %d", min, max)

}

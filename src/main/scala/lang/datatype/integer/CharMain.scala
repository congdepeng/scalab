package lang.datatype.integer

object CharMain extends App {

  private val clazz: Class[_] = Char.getClass
  println(clazz)

//  final val MinValue = java.lang.Character.MIN_VALUE ='\u0000';
//  final val MaxValue = java.lang.Character.MAX_VALUE ='\uFFFF';
  private val min: Char = Char.MinValue
  private val max: Char = Char.MaxValue

  private val a: Character = Char.box('a')
  private val z: Character = Char.box('z')
  printf("%s - %s", a.toString, z.toString)

}

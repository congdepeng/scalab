package lang.datatype.floatable

object FloatMain extends App{

   private val clazz: Class[_] = Float.getClass
   println(clazz)

 //  final val MinValue = -java.lang.Float.MAX_VALUE
 //  final val MaxValue = java.lang.Float.MAX_VALUE
   private val max: Float = Float.MaxValue
   private val min: Float = Float.MinValue

   printf("%f %f", min, max)

 }

package lang.datatype.number.floatable

object DoubleMain extends App{

   private val clazz: Class[_] = Double.getClass
   println(clazz)

 //  final val MinValue = -java.lang.Float.MAX_VALUE
 //  final val MaxValue = java.lang.Float.MAX_VALUE
   private val max: Double = Double.MaxValue
   private val min: Double = Double.MinValue

   printf("%f %f", min, max)

 }

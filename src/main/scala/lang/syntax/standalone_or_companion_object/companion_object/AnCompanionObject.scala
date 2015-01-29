package lang.syntax.standalone_or_companion_object.companion_object


//定义一个类
class AnCompanionObject {
  private var sum = 0

  def add(b: Byte) {
    sum += b
  }

  def checksum(): Int = ~(sum & 0xFF) + 1
}


//定义一个伴生对象
object AnCompanionObject {
  private var cache = Map[String, Int]()

  def calculate(target: String): Int =
    if (cache.contains(target)) {
      cache(target)

    } else {
      val newObjectByClass = new AnCompanionObject

      //把输入字符一个一个的add进来
      for (c <- target) {
        newObjectByClass.add(c.toByte)
      }

      //计算checksum根据add的数据
      val cs = newObjectByClass.checksum()
      cache += (target -> cs)
      cs
    }
}


object Summer {
  def main(args: Array[String]) {
    println(AnCompanionObject.calculate("Every value is an object."))
  }
}
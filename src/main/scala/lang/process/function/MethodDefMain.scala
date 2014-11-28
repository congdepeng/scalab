package lang.process.function

object MethodDefMain extends App {

  def sum(args: Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  sum()
  sum(1)
  sum(1, 2)
  sum(1, 2, 3)

  val iList = List(1, 2, 3)

  //sum(iList) // - Error
  sum(iList: _*) // what is _*???????????

}

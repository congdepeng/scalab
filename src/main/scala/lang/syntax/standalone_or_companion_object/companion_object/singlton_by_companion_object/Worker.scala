package lang.syntax.standalone_or_companion_object.companion_object.singlton_by_companion_object

/**
 * private类构造器，别人无法访问，除了它的伴生对象
 */
class Worker private{

  def work() = println("work say")

}


object Worker{
  private val worker: Worker = new Worker
  def getInstance():Worker ={
    worker.work()
    worker
  }
}

object Main{
  def main (args: Array[String]) {
    //val worker: Worker = new Worker() : Error:constructor Worker in class Worker cannot be accessed in object Main
    for (i <- 1 to 10) {
      Worker.getInstance()
    }

  }

}
package lang.syntax.underscore

//[wildcard imports]
import javax.annotation._

//[Hiding imports] Applet not imported
import java.applet.{Applet => _, _}



import scala.collection.immutable

object UnderscoreMain extends App {

  //Applet cannot be used here, hiding imported

  //[Ignored Parameters by _]
  private val intList: List[Int] = List(1, 2, 3)
  intList.foreach(println)
  intList.foreach({ not_ignore_param => println("{}" + not_ignore_param)})
  intList.foreach({ _ => println("{}")})
  intList foreach ({ _ => println("(event param ignored)")})
  intList foreach { _ => println("event param ignored")}


  //[Wildcard patterns]
  Some(5) match {
    case Some(1) => println("1")
    case Some(5) => println("5")
    case Some(_) => println("Yes")
  }
  Some(500) match {
    case Some(1) => println("1")
    case Some(5) => println("5")
    case Some(_) => println("Yes, match not in [1,5]")
  }


  //[Joining letters to punctuation]
  def add_1_!(x: Int) = x +1
  assert(add_1_!(1) == 2)


  //[Assignment operations]
  // because you *cannot* contact 'foo' and '=' directly, must add a _ between them
  def foo (x: Int) { x+1 }
  def foo_= (x: Int) { x+1 }
  assert(foo (100) == foo_= (100))

  //[Placeholder syntax]
  private val intAfterAdd1: List[Int] = List(1, 2) map (_ + 2)
  assert(intAfterAdd1.reduceLeft(_+_) == 7)


  List(1, 2, 3) foreach println _



}

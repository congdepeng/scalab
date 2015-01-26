package lang.datatype.compound.traits
import scala.collection.mutable

trait Filter {

  def filter(request: mutable.HashMap[AnyRef, AnyRef]) = {
    out(request)
  }

  
def out(request: mutable.HashMap[AnyRef, AnyRef]) {
    for (x <- request) {
      println(x)
    }
  }
}

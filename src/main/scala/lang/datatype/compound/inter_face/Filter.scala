package lang.datatype.compound.inter_face

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

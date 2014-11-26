package lang.datatype.compound.traits

import scala.collection.mutable

class MapFilter extends Filter {

  override def out(request: mutable.HashMap[AnyRef, AnyRef]) = {
    for (x <- request) {
      println("out in map filer:" + x)
    }
  }

}

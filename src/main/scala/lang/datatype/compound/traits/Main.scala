package lang.datatype.compound.traits

import scala.collection.mutable


object Main extends App {
  private val map: mutable.HashMap[AnyRef, AnyRef] = mutable.HashMap()
  map.put("1", "1")

  private val filterMap: MapFilter = new MapFilter()
  filterMap.filter(map)

  private val filter: Filter with Object = new Filter {}
  filter.filter(map)
}

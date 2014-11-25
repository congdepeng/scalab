package lang.datatype.simple.define

import etc.StudentClass

object Main extends App {

  private val jack: StudentClass = new StudentClass("jack")
  println(jack.getName)
  println(jack.getname())

  println(jack.ages)
  println(jack.ages_=(10, allowException = true))
  println(jack.ages)
  println(jack.ages_=(-10, allowException = false))
  println(jack.ages)

  println(jack.hours)
  jack.hours = 8
  println(jack.hours)
  //jack.hours = 25 : Exception
  println(jack.hours)
}


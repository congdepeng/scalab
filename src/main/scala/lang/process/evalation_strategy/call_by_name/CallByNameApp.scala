package lang.process.evalation_strategy.call_by_name

object CallByNameApp extends App{

  // ###########################################
  //1. => used as call by name
  // ###########################################
  def high_level_like(executableUnitReturnInt: => Int) = executableUnitReturnInt * executableUnitReturnInt
  var y = 1
  private val result: Int = high_level_like{y+=1;y}
  assert(result == 6)
  //{ y += 1; y } * { y += 1; y }
  //{ 1 += 1; 2 } * { 2 += 1; 3 }
  //          2   *           3
  // 6



  // ###########################################
  // => used as anonymous function
  // ###########################################
  (x:Int) =>  println("fun body"+ x)// not assign to a val, next line assigned and called
//|ana param| |ana function body   |

  // ###########################################
  // => used as function return type define(1) and anonymous function(2)
  // ###########################################
  val anonymousFun: Int => Unit   = (x:Int)     => println("fun body: received param ="+ x)
  //  |function id| |return type| = |ana param| => ana function body
  val anonymousFunResult: Unit = anonymousFun(1)


  // ###########################################
  // first "() => Unit" in one line is an anonymous function literal of arity 0
  // second "() => Unit" after "val f:" is a param and return type define: 函数就必须要定义输入和输出，（）代表空输入，Unit是输出
  // ###########################################
  () => Unit
  val f: () => Unit = () => println("I'm an anonymous function")
  f()

  //define a 1 parameter function
  val iToSting: (Int) => String = (i:Int) => i.toString
  //  |id     | |in => out    | = |param| => |body return String|
  assert("100" == iToSting(100))


  //Unit is a param return type in fun,gun. 通常Unit只用来声明函数或方法的返回值，其他场景基本是没有意义的。
  val fun = (x: Unit) => println("I'm fun")
  val gun = (x: Unit) => println("I'm gun")
  val hun = fun andThen gun
  hun()



}

package lang.syntax.for_some

object ForSomeApp extends App{

  class Foo[A]

  type Outer = List[Foo[T]] forSome { type T } // type must match only 1 type
  type Inner = List[Foo[T] forSome { type T }] // more loose


  val inner: Inner = List(new Foo[Char], new Foo[Int])

//val outer: Outer = List(new Foo[Char], new Foo[Int]) // type mismatch
//  Error:(12, 26) type mismatch;
//  found   : List[lang.syntax.for_some.ForSomeApp.Foo[_ >: Int with Char <: AnyVal]]
//  required: lang.syntax.for_some.ForSomeApp.Outer
//  (which expands to)  List[lang.syntax.for_some.ForSomeApp.Foo[T]] forSome { type T }
//  val outer: Outer = List(new Foo[Char], new Foo[Int])
//  ^

}

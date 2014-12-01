package lang.process.function

object DclDefFunction extends App {

  //[DECLARE, without value]
  //  Dcl                ::=  ‘def’ FunDcl
  //  FunDcl             ::=  FunSig ‘:’ Type

  //[DECLARE, with actually value]
  //  Def                ::=  ‘def’ FunDef
  //  FunDef             ::=  FunSig [‘:’ Type] ‘=’ Expr

  //  FunSig             ::=  id [FunTypeParamClause] ParamClauses
  //  FunTypeParamClause ::=  ‘[’ TypeParam {‘,’ TypeParam} ‘]’
  //  ParamClauses       ::=  {ParamClause} [[nl] ‘(’ ‘implicit’ Params ‘)’]
  //  ParamClause        ::=  [nl] ‘(’ [Params] ‘)’}
  //  Params             ::=  Param {‘,’ Param}
  //  Param              ::=  {Annotation} id [‘:’ ParamType] [‘=’ Expr]
  //  ParamType          ::=  Type
  //  |  ‘=>’ Type
  //  |  Type ‘*’

  //- FunSig : function signature
  //- FTPC: FunTypeParamClause, this clause define T, if not have this clause, cannot use T afterwards

  def compare[T, P](a: T = 0)(b: P = a): Boolean = {a == b}
  //  |-----------------FunDcl-----------------| = |-Expr-|
  //  |-----------------FunSig--------|: |-Type| = |-Expr-|
  //  |--id-| FTPC |--ParamClauses----|: |-Type| = |-Expr-|


  //define a function and bind to a val. (functional program, anonymous function)
  val fun_add3: (Int, Int, Int) => Int = _ + _ + _
  //  |--id--|: |--ParamClauses|=> |T| = |--Expr-|
  val fun_add3T: (Int, Int, Int) => Int = {_ + _ + _}
  //  |--id---|: |--ParamClauses|=> |T| = |--Expr---|
  val fun_add3F: (Int, Int, Int) => Int = _ + _ + _ + 100
  //  |--id---|: |--ParamClauses|=> |T| = |--Expr-------|
  val fun_add3G: ((Int, Int, Int) => Int) = _ + _ + _ + 100
  //  |--id---|: (|--ParamClauses|=> |T|) = |--Expr-------|

  // "_ + _ + _ + 100" is a function but 1 + 2 + 3 is assignment
  val function : (Int, Int, Int) => Int = _ + _ + _ + 100
  val fun_add3H: ((Int, Int, Int) => Int) = function


  //underscore is a special placeholder
  val a:Int =1
  val b:Int =1
  val c:Int =1
  val expression : Int = a + b + c + 100


  assert(compare(1)(1))
  assert(!compare(1)(2l))
  assert(!compare(1)("2l"))
  private val result: Boolean = compare(1)(2)
  assert(compare(1)(2) == result)


}

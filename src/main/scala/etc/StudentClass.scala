package etc


class StudentClass(name: String) {

  private var a: Int = 0
  private val _name = name

  def getName: String = {
    _name
  }

  def getname(): String = {
    _name
  }

  def isNameEmpty: Boolean = _name.isEmpty


  def ages = a

  //because you *cannot* contact 's' and '=', must add a _ between them
  def ages_= (hp: Int, allowException: Boolean) = if (hp > 0) this.a = hp else if(allowException) throw new Error()

//  def ages_=(h: Int) = if (0 <= h && h < 24) this.a = h
//  else throw new Error()

  private var h: Int = 0

  def hours              =  h
  def hours_= (h: Int)   =  if (0 <= h && h < 24) this.h = h
  else throw new Error()


}

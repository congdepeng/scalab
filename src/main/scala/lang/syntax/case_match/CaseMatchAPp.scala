package lang.syntax.case_match

object CaseMatchAPp extends App {

  println(getContextTypeByExt("jpe"))
  println(getContextTypeByExt("jpg"))
  println(getContextTypeByExt("jpeg"))
  println(getContextTypeByExt("png"))
  println(getContextTypeByExt("gif"))
  println(getContextTypeByExt("bmp"))
  println(getContextTypeByExt("jpeg"))
  println(getContextTypeByExt("abc"))


  def getContextTypeByExt(ext: String) = ext match {
    case "jpe" => "image/jpeg"
    case "jpg" => "image/jpeg"
    case "jpeg" => "image/jpeg"
    case "png" => "image/png"
    case "gif" => "image/gif"
    case "bmp" => "image/bmp"
    case _ => "image/jpeg"
  }


}





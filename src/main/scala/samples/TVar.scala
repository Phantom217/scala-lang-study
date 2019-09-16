package samples

object TVar {
  def datatypes: Unit = {
    val byte:     Byte      = 64
    val short:    Short     = 20
    val int:      Int       = 123
    val long:     Long      = 5873
    val float:    Float     = 546
    val double:   Double    = 3.9
    val char:     Char      = 'z'
    val string:   String    = "Hi"
    val boolean:  Boolean   = false

    println(s"byte:     ${byte.getClass}    ${byte}")
    println(s"short:    ${short.getClass}   ${short}")
    println(s"int:      ${int.getClass}     ${int}")
    println(s"long:     ${long.getClass}    ${long}")
    println(s"float:    ${float.getClass}   ${float}")
    println(s"double:   ${double.getClass}  ${double}")
    println(s"char:     ${char.getClass}    ${char}")
    println(s"string:   ${string.getClass}  ${string}")
    println(s"boolean:  ${boolean.getClass} ${boolean}")
  }
}

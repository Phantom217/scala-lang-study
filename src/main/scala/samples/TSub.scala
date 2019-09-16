package samples

object TSub {
  def subprograms: Unit = {
    var m = sub1
    println(s"m = $m")
    var n : Int = 3
    m = 2
    n = sub2(m, n) + 4
    println(s"n = $n")
  }

  private def sub1 = 1
  private def sub2(p: Int, q: Int) = p + q
}

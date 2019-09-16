package samples

object TLoop {
  def loops: Unit = {
    val a = Array("apple", "banana", "orange")

    for (i <- 0 until a.length) {
      printf(s"$i is ${a(i)}\n")
    }
  }
}

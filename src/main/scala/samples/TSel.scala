package samples

object TSel {
  def selections: Unit = {
    val i1: Int = 1; val i2 = 2; val i3 : Int = 3
    val i4: Int = 4; val i5 = 5; val i6 : Int = 6

    // Test a simple if
    if (i4 > i1) println("i4 > i1")

    // Test if-else
    if ((i5 < i2) && (i3 >= i2)) println("(i5 < i2) && (i3 >= i2)")
    else println("(i5 >= i2) || (i3 < i2)")

    // Test nested if-else
    if (i1 != i2) println("(i1 != i2)")
    else {
      if ((i4 == i5) || (i5 != i6))
        println("(i1 == i2) && ((i4 == i5) || (i5 != i6)")
    }
  }
}

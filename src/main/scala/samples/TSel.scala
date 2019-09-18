package samples

object TSel {
  // Examples of `if`, `if-else`, nested `if-else`, and `else-if`

  def selections: Unit = {

    // col 1 shows one way of itinializing a variable in Scala
    // col 2 shows off Scala's interpreted feature
    // col 3 is just a different way of writing col 1
    val i1: Int = 1; val i2 = 2; val i3 : Int = 3
    val i4: Int = 4; val i5 = 5; val i6 : Int = 6
    val i7: Int = 7; val i8 = 8; val i9 : Int = 9

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

    //Test else-if
    if(i1 >= i5) println("i1 >= i5")
    else if((i9 / i3) >= i3) println("(i9 / i3) >= i3")
    else println("None of the above are true.")
  }
}

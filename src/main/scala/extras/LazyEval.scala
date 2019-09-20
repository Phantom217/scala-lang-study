package extras

object LazyEval {
  // Demonstration of strict evaluation vs lazy evaluation
  def evaluation: Unit = {
    // Strict evaluation
    println("Strict evaluation:")
    val pao1 = { print(" Pao ") ; 5}
    print(" awesome ")
    print(pao1)

    // Lazy evaluation
    println(s"\n\nLazy evaluation:")
    lazy val pao2 = { print(" Pao ") ; 5}
    print(" awesome ")
    print(pao2)

    // Cached Lazy evaluation
    println(s"\n\nCached lazy evaluation:")
    lazy val pao3 = { print(" Pao ") ; 5}
    print(" awesome ")
    print(pao3)
    print(pao3)
  }

  // Demonstrating stream examples
  def stream: Unit = {
    // Creating a stream but only printing the first element
    println(s"\n\n\nCreating a stream with 4 numbers using #:")
    val stream1: LazyList[Int] = 1 #:: 2 #:: 3 #:: 4 #:: LazyList.empty
    println(s"Elements of stream1 = $stream1")

    // Printing all elements of stream 1
    println(s"\nPrinting all elements of stream:")
    stream1 take 4 foreach println

    // Showing that no IndexOutOfBoundsException was thrown
    println(s"\nWhat happens if you take more than what is in the stream?")
    stream1 take 20 foreach println

    // Infinite stream
    // println("Taking only 10 numbers from an infinite stream:")
    // infiniteNumberLazyList(1).take(10).print
  }

  /* Do not use this def when creating the menu; only used for another def */
  // def infiniteNumberLazyList(n: Int): LazyList[Int] = {
  //   LazyList.cons(n, infiniteNumberLazyList(n + 1))
  // }
}

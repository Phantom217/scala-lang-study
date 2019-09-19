package extras

object LazyEval {
  // Demonstration of strict evaluation vs lazy evaluation
  def evaluation: Unit = {
    // Strict evaluation
    println("Strict evaluation:")
    val pao1 = { print(" Pao ") ; 5}
    print(" awesome ")
    print(pao1)

    println("\n")

    // Lazy evaluation
    println("Lazy evaluation:")
    lazy val pao2 = { print(" Pao ") ; 5}
    print(" awesome ")
    print(pao2)

    println("\n")

    // Cached Lazy evaluation
    println("Cached lazy evaluation:")
    lazy val pao3 = { print(" Pao ") ; 5}
    print(" awesome ")
    print(pao3)
    print(pao3)
  }

  // Demonstrating stream examples
  def stream: Unit = {
    println("\n\n")

    // Creating a stream but only printing the first element
    println("Creating a stream with 4 numbers using #:")
    val stream1: Stream[Int] = 1 #:: 2 #:: 3 #:: 4 #:: Stream.empty
    println(s"Elements of stream1 = $stream1")

    println("\n")

    // Printing all elements of stream 1
    println("Printing all elements of stream:")
    stream1.take(4).print

    println("\n")

    // Showing that no IndexOutOfBoundsException was thrown
    println("What happens if you take more than what is in the stream?")
    stream1.take(20).print

    println("\n")

    // Infinite stream
    println("Taking only 10 numbers from an infinite stream:")
    infiniteNumberStream(1).take(10).print
  }

  def infiniteNumberStream(n: Int): Stream[Int] = {
    Stream.cons(n, infiniteNumberStream(n + 1))
  }
}

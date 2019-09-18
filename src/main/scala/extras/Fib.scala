package extras

object ImperativeStyle {
  // Imperative "Java" style
  def fibImp(n: Int): Int = {
    var i = 0; var j = 1

    for (k <- 0 until n)
    {
      val l = i + j
      i = j; j = l
    }
    i
  }
}

object RecursiveStyle {
  // Recursive style, slow
  def fibRec(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fibRec(n - 1) + fibRec(n - 2)
  }
}

object TailRecStyle {
  // Recursive style with tail call optimization, fast
  def fibTailRec(n: Int): Int = {
    @annotation.tailrec
    def fib(i: Int, v: Int, vNext: Int): Int =
      if (i == n) v
      else fib(i + 1, vNext, v + vNext)
    fib(0, 0, 1)
  }
}

// Not too sure how this works so not putting it in demo
// object StreamStyle {
//   val fibStream: Stream[Int] =
//     0 #:: 1 #:: (fibStream zip fibStream.tail).map(n => n._1 + n._2)
// }

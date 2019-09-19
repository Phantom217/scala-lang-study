package extras

class AnonFunc {
  // Anonymous Functions

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def sumInts (a: Int, b: Int) = sum(x => x, a, b)
  def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)

}

object AnonFunc {
  def example: Unit = {
    // println(sumInts(1, 5))
    // println(sumCubes(1, 6))
  }
}

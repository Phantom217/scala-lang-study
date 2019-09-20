package example

import extras._

object ExAnonFunc {

  def demo: Unit = {
    println(s"sum of all integers from 1 to 5 = ${AnonFunc.sumInts(1, 5)}")
    println(s"sum of the cube of all integers from 1 to 6 = ${AnonFunc.sumCubes(1, 6)}")
  }
}

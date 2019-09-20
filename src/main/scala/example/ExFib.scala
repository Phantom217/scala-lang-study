package example

import time._
import extras._

object ExFib {

  def demo: Unit = {
    println(s"Calculating the Fibonacci sequence imperatively")
    lazy val imperative = ImperativeStyle.fibImp(30)
    val imp_time = Time.time { imperative }
    // println(s"${ImperativeStyle.fibImp(30)}")

    println(s"Calculating the Fibonacci sequence with regular recursion")
    lazy val recursive = RecursiveStyle.fibRec(30)
    val rec_time = Time.time { recursive }

    println(s"Calculating the Fibonacci sequence with tail recursion")
    lazy val tail = TailRecStyle.fibTailRec(30)
    val tail_time = Time.time { tail }
  }
}

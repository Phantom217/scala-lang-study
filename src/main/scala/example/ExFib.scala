package example

import time._
import extras._

object ExFib {

  def demo: Unit = {
    println(s"Calculating the Fibonacci sequence in 3 ways...")
    print(s"Using imperative style: \t")
    lazy val imperative = ImperativeStyle.fibImp(30)
    val imp_time = Time.time { imperative }

    print(s"Using normal recursion: \t")
    lazy val recursive = RecursiveStyle.fibRec(30)
    val rec_time = Time.time { recursive }

    print(s"Using tail recursion: \t\t")
    lazy val tail = TailRecStyle.fibTailRec(30)
    val tail_time = Time.time { tail }
  }
}

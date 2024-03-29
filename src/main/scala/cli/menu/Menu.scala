package cli.menu

import scala.io.StdIn._

import samples._
import extras.LazyEval
import example._

object CliMenu {

  val actionMap =
    Map[Int, () => Boolean](1 -> handleOne, 2 -> handleTwo,
    3 -> handleThree, 4 -> handleFour, 5 -> handleFive,
    6 -> handleSix, 7 -> handleSeven, 8 -> handleEight,
    9 -> handleNine, 10 -> handleTen, 11 -> handleEleven,
    0 -> exitMenu)

  def handleOne(): Boolean = {
    println
    println(s"${TSimple.hello}")
    true
  }
  def handleTwo(): Boolean = {
    println
    TVar.datatypes
    true
  }
  def handleThree(): Boolean = {
    println
    TSel.selections
    true
  }
  def handleFour(): Boolean = {
    println
    TLoop.loops
    true
  }
  def handleFive(): Boolean = {
    println
    TSub.subprograms
    true
  }
  def handleSix(): Boolean = {
    println
    ScalaInput.sinput
    true
  }
  def handleSeven(): Boolean = {
    println
    JavaInput.jinput
    true
  }
  def handleEight(): Boolean = {
    println
    ExFib.demo
    true
  }
  def handleNine(): Boolean = {
    println
    ExGenerics.stack_int
    ExGenerics.stack_custom
    true
  }
  def handleTen(): Boolean = {
    println
    ExAnonFunc.demo
    true
  }
  def handleEleven(): Boolean = {
    println
    LazyEval.evaluation
    LazyEval.stream
    true
  }
  def exitMenu(): Boolean = {
    println(s"\nBye")
    false
  }

  def menu(option: Int): Boolean = {
    actionMap.get(option) match {
      case Some(f) => f()
      case None =>
        println(s"\nSorry, $option is not recognized")
        false
    }
  }

  def read_option: Int = {
    println(s"""|\nPlease select one of the following:
                | 1  - Simple (Hello)
                | 2  - Variables
                | 3  - Selections
                | 4  - Loops
                | 5  - Subprograms
                | 6  - Scala Input Style
                | 7  - Java Input Style
                | 8  - Extras - Tail Recursion
                | 9  - Extras - Generic Classes
                | 10 - Extras - Anonymous Functions
                | 11 - Extras - Lazy Evaluation
                | 0  - quit""".stripMargin)
    readInt()
  }

  def run_menu: Unit = {
    var opt = 0
    do {
      opt = read_option
    } while (menu(opt))
  }
}

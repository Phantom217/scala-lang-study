package cli.menu

import scala.io.StdIn._

import samples._

object CliMenu {

  val actionMap = Map[Int, () => Boolean](1 -> handleOne, 2 -> handleTwo,
                  3 -> handleThree, 4 -> handleFour, 5 -> handleFive,
                  6 -> handleSix, 7 -> handleSeven, 0 -> exitMenu)

  def handleOne(): Boolean = {
    println(s"${TSimple.hello}")
    true
  }
  def handleTwo(): Boolean = {
    TVar.datatypes
    true
  }
  def handleThree(): Boolean = {
    TSel.selections
    true
  }
  def handleFour(): Boolean = {
    TLoop.loops
    true
  }
  def handleFive(): Boolean = {
    TSub.subprograms
    true
  }
  def handleSix(): Boolean = {
    ScalaInput.sinput
    true
  }
  def handleSeven(): Boolean = {
    JavaInput.jinput
    true
  }
  def exitMenu(): Boolean = {
    println("Bye")
    false
  }

  def menu(option: Int): Boolean = {
    actionMap.get(option) match {
      case Some(f) => f()
      case None =>
        println(s"Sorry, $option is not recognized")
        false
    }
  }

  def read_option: Int = {
    println(s"""|\nPlease select one of the following:
               | 1 - Simple (Hello)
               | 2 - Variables
               | 3 - Selections
               | 4 - Loops
               | 5 - Subprograms
               | 6 - Scala Input Style
               | 7 - Java Input Style
               | 0 - quit""".stripMargin)
    readInt()
  }

  def run_menu: Unit = {
    var opt = 0
    do {
      opt = read_option
    } while (menu(opt))
  }
}

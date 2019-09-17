package cli.menu

import scala.io.StdIn._

object CliMenu {

  val actionMap = Map[Int, () => Boolean](1 -> handleOne, 2 -> handleTwo,
                  3 -> handleThree, 4 -> handleFour, 5 -> handleFive,
                  6 -> handleSix, 7 -> handleSeven, 0 -> exitMenu)

  def handleOne(): Boolean = {
    println("selected 1")
    true
  }
  def handleTwo(): Boolean = {
    println("selected 2")
    true
  }
  def handleThree(): Boolean = {
    println("selected 3")
    true
  }
  def handleFour(): Boolean = {
    println("selected 4")
    true
  }
  def handleFive(): Boolean = {
    println("selected 5")
    true
  }
  def handleSix(): Boolean = {
    println("selected 6")
    true
  }
  def handleSeven(): Boolean = {
    println("selected 7")
    true
  }
  def exitMenu(): Boolean = {
    println("selected 0")
    false
  }

  def menu(option: Int): Boolean = {
    actionMap.get(option) match {
      case Some(f) => f()
      case None =>
        println("Sorry, that command is not recognized")
        false
    }
  }

  def read_option: Int = {
    println("""|Please select one of the following:
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

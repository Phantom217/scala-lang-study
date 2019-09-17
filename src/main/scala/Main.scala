import scala.io.StdIn._

import samples._
import extras._

object Main extends App {
  //extras.StreamStyle
  // JavaInput.jinput
  // stack_int
  // stack_string
  val userExit: Boolean = false
  val a: String = TSimple.hello

  println(a)
  // do{ 
  //   create_console

  //   val input = readInt()
  //   //get_user_input(input)

  // }while(!userExit)
  


  def stack_int: Unit = {
    val stack = new GenericClasses.Stack[Int]
    stack.push(1)
    stack.push(2)
    println(stack.pop)  // prints 2
    println(stack.pop)  // prints 1
  }

  class Fruit
  class Apple extends Fruit
  class Banana extends Fruit

  def stack_string: Unit = {
    val stack  = new GenericClasses.Stack[Fruit]
    val apple  = new Apple
    val banana = new Banana

    stack.push(apple)
    stack.push(banana)

    println(stack.pop)
    println(stack.pop)
  }

  def create_console: Unit = {
    println("----------------------")
    println("Enter command. 1-6")
    println("[1]  TSimple")
    println("[2]  TVar")
    println("[3]  TSel")
    println("[4]  TLoop")
    println("[5]  TSub")
    println("[6]  SInput")
    println("[7]  JInput")
    println("[0]  Exit")
    println("----------------------")
  }

  // def get_user_input(userInput: Int): String = userInput match{
  //     //case 1 => println(a)
  //     // case 2 => TVar.datatypes
  //     // case 3 => TSel.selections
  //     // case 4 => TLoop.loops
  //     // case 5 => TSub.subprograms
  //     // case 6 => ScalaInput.sinput
  //     // case 7 => JavaInput.jinput
  //     //case _ => !userExit;
  // }
}

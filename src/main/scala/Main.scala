import samples._
import extras._

object Main extends App {
  // JavaInput.jinput
  // stack_int
  // stack_string

  // val option = 1
  // option match {
  //   case 1 => TSimple.hello
  //   case 2 => TVar.datatypes
  //   case 3 => TSel.selections
  //   case 4 => TLoop.loops
  //   case 5 => TSub.subprograms
  //   case 6 => ScalaInput.sinput
  //   case 7 => JavaInput.jinput
  //   case _ => break()
  // }


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
}

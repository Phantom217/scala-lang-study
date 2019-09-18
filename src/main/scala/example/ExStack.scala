import extras._

object ExStack {
  // code to create a stack of any type to demonstrate generic typing

  def stack_int: Unit = {
    val stack = new GenericClasses.Stack[Int]

    stack.push(1)
    stack.push(2)

    println(stack.pop)
    println(stack.pop)
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

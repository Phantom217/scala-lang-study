package example

import extras._

object ExGenerics {
  // code to create a stack of any type to demonstrate generic typing

  def stack_int: Unit = {
    val stack = new GenericClasses.Stack[Int]

    stack.push(1)
    stack.push(2)

    println(s"stack of type Integer:")
    println(stack.pop)
    println(stack.pop)
  }

  class Fruit
  class Apple extends Fruit
  class Banana extends Fruit

  def stack_custom: Unit = {
    val stack  = new GenericClasses.Stack[Fruit]
    val apple  = new Apple
    val banana = new Banana

    stack.push(apple)
    stack.push(banana)

    println(s"\nstack of type Fruit:")
    println(stack.pop)
    println(stack.pop)
  }
}

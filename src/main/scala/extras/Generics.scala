package extras

object GenericClasses {
  // demo generic typed classes

  class Stack[A] {    // Stack of any type denoted as [A]
    private var elements: List[A] = Nil
    def push(x: A): Unit = { elements = x :: elements }
    def peek: A = elements.head
    def pop(): A = {
      val currentTop = peek
      elements = elements.tail
      currentTop
    }
  }
}

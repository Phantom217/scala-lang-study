package samples

import scala.io.StdIn._

object ScalaInput {
  // input using only native scala objects

  def sinput: Unit = {

    // readLine lets you prompt the user and read their input as a String
    val name = readLine("What is your name? ")

    // readInt lets you read an Int, but you have to prompt the user manually
    println()
    print("How old are you? ")
    val age = readInt()

    println(s"\nYour name is $name and you are $age years old.")
  }
}

object JavaInput {
  import java.util.Scanner
  // input using Java's Scanner object

  def jinput: Unit = {
    print("Enter your name, age and weight: ")
    val input  = readLine()
    val line   = new Scanner(input)
    val name   = line.next
    val age    = line.nextInt
    val weight = line.nextDouble
    println(s"\nYour name is $name, you are $age years old and weigh $weight pounds.")
  }
}

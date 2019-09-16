package samples

object ScalaInput {
  import scala.io.StdIn._

  def sinput(args: Array[String]): Unit = {

    // readLine lets you prompt the user and read their input as a String
    val name = readLine("What is your name? ")

    // readInt lets you read an Int, but you have to prompt the user manually
    print("How old are you? ")
    val age = readInt()

    println(s"Your name is $name and you are $age years old.")
  }
}

object JavaInput {
  import java.util.Scanner

  def jinput(args: Array[String]): Unit = {
    print("Enter your name, age and weight: ")
    val input  = readLine()
    val line   = new Scanner(input)
    val name   = line.next
    val age    = line.nextInt
    val weight = line.nextDouble
    println(s"Your name is $name, you are $age years old and weigh $weight pounds.")
  }
}

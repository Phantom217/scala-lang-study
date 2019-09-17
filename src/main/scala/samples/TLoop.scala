package samples

object TLoop {
  def loops: Unit = {
    val a = Array("apple", "banana", "orange")
    var counter: Double = 0

    //Test for loop
    for (i <- 0 until a.length) {
      printf(s"$i is ${a(i)}\n")
    }

    //Test while loop
    while(counter < 5){
      println(s"counter = ${counter}")
      counter += 1
    }

    //Test do-while loop
    counter = 0
    do {
      println(s"do-while counter = ${counter}")
      counter += 1
      counter *= 2
    }while(counter <= 200)


  }
}

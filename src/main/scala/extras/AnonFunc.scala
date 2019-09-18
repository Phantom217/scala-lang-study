package extras

object AnonymousFunc{          
    def div(d: Double => Double, a: Double, b: Double): Double =
    if (b != 0) d(a) / d(b)
    else 0
 
    def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

    def sumInts(a: Int, b: Int) = sum(x => x, a, b)
    def sumCubes(a: Int, b: Int) = sum(x => x * x * x, a, b)

    println(div(x => x, 4, 4))
    println(sumInts(1,5))
    println(sumCubes(1,5))

    println(div(x => x, sumCubes(1,5), sumInts(1,10)))
    println
}  
 
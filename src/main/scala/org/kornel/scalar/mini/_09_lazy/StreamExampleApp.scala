package org.kornel.scalar.mini._09_lazy

object StreamExampleApp extends App {

  val stream = Stream(1, 2, 3, 4, 5, 6, 7, 8)

  def twice(n: Int): Int = {
    println(s"Working hard on $n")
    n * 2
  }

  println("Before map")

  val lessThan10 = stream.map(twice).takeWhile(_ < 10)

  println("After map")

  lessThan10.foreach(println)

}

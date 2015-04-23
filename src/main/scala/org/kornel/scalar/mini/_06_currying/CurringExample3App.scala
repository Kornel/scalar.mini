package org.kornel.scalar.mini._06_currying

object CurringExample3App extends App {

  val xs = List(1, 2, 3, 4, 5, 6)

  val multiply: Int => Int => Int =
    a => b => a * b

  val twice = multiply(2)

  xs.map(twice)
    .foreach(println)

}

package org.kornel.scalar.mini._06_currying

object CurringExample3App extends App {

  val multiply: Int => Int => Int = {
    a => b => a * b
  }

  val xs = List(1, 2, 3, 4, 5, 6)

  val twice = xs.map(multiply(2))

  twice.foreach(println)

}

package org.kornel.scalar.mini._06_currying

object CurringExample2App extends App {

  val multiply: Int => Int => Int = {
    a => b => a * b
  }

  println(multiply(10)(20))

}

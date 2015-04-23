package org.kornel.scalar.mini._06_currying

object CurringExampleApp extends App {

  def multiply(a: Int, b: Int): Int = a * b

  println(multiply(10, 20))

  def multiply2(a: Int): Int => Int = {
    b => a * b
  }

  println(multiply2(10)(20))

}

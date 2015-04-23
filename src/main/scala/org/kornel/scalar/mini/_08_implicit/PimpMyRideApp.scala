package org.kornel.scalar.mini._08_implicit

object PimpMyRideApp extends App {

  import Pimp.RichDouble

  val power = 2.0 ^^ 10.0

  println(power)

}

object Pimp {

  implicit class RichDouble(value: Double) {
    def ^^(n: Double) = math.pow(value, n)
  }
}

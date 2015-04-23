package org.kornel.scalar.mini._09_lazy

import scala.annotation.tailrec

object NewtonRaphsonApp extends App {

  @tailrec
  def within(epsilon: Double, s: Stream[Double]): Double = s match {
    case x0 #:: x1 #:: xs => if (math.abs(x0 - x1) < epsilon) x1 else within(epsilon, x1 #:: xs)
  }

  def sqrt(n: Double)(implicit epsilon: Double): Double = {
    def next(x0: Double) = (x0 + n / x0) / 2
    val initial = n / 2

    within(epsilon, Stream.iterate(initial)(next))
  }

  implicit val epsilon = 0.1

  val numbers = List(64, 16, 416025)

  val result = numbers
    .map(n => n -> sqrt(n))
    .map(r => s"sqrt(${r._1}) == ${r._2}")

  result.foreach(println)
}

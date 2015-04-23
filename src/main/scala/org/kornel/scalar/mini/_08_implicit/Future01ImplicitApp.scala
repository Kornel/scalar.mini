package org.kornel.scalar.mini._08_implicit

import scala.concurrent.{Future, Await}
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

object Future01ImplicitApp extends App {

  val eventualSum = Future {
    println(s"Sum is doing work in ${Thread.currentThread.getName}")
    10 + 20
  }

  val eventualProduct = Future {
    println(s"Product is doing work in ${Thread.currentThread.getName}")
    5 * 6
  }

  println(s"Main work in ${Thread.currentThread.getName}")

  val sum = Await.result(eventualSum, 5.seconds)
  val product = Await.result(eventualProduct, 5.seconds)

  println(s"Sum: $sum")
  println(s"Product: $product")
}

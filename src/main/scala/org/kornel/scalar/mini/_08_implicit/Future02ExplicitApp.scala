package org.kornel.scalar.mini._08_implicit

import java.util.concurrent.Executors

import scala.concurrent.duration._
import scala.concurrent.{ExecutionContext, Await, Future}

object Future02ExplicitApp extends App {

  val threadPool = Executors.newFixedThreadPool(2)
  val executionContext = ExecutionContext.fromExecutor(threadPool)

  val eventualSum = Future(10 + 20)(executionContext)

  val eventualProduct = Future(5 * 6)(executionContext)

  val sum = Await.result(eventualSum, 5.seconds)
  val product = Await.result(eventualProduct, 5.seconds)

  println(s"Sum: $sum")
  println(s"Product: $product")

  threadPool.shutdown()
}

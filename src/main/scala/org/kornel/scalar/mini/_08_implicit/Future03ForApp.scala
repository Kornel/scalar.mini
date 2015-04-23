package org.kornel.scalar.mini._08_implicit

import scala.concurrent.duration._
import scala.concurrent.{Await, ExecutionContext, Future}

object Future03ForApp extends App {

  implicit val executionContext = ExecutionContext.global

  val eventualA = Future(10 + 20)(executionContext)
  val eventualB = Future(5 * 6)(executionContext)

  val eventualSum = for {
    a <- eventualA
    b <- eventualB
  } yield a + b

  val sum = Await.result(eventualSum, 5.seconds)

  println(s"Sum: $sum")
}

package org.kornel.scalar.mini._05_beexplicit.oet

import scala.util.{Failure, Success, Try}

object TryApp extends App {

  val numeratorString = "20"
  val denominatorString = "10"

  val quotient = for {
    n <- Try(Integer.parseInt(numeratorString))
    d <- Try(Integer.parseInt(denominatorString))
  } yield n / d

  quotient match {
    case Success(q) => println(s"$numeratorString / $denominatorString = $q")
    case Failure(t) => println(s"Failed with ${t.getClass}, message: ${t.getMessage}")
  }

}

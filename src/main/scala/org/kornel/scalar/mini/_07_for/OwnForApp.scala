package org.kornel.scalar.mini._07_for

object OwnForApp extends App {

  case class Circus[A](n: A) {
    def map[B](f: A => B): Circus[B] = Circus(f(n))
    def flatMap[B](f: A => Circus[B]): Circus[B] = f(n)
  }

  val circus1 = Circus(10)
  val circus2 = Circus(20)
  val circus3 = Circus(30)

  val uberCircus = for {
    c1 <- circus1
    c2 <- circus2
    c3 <- circus3
  } yield c1 + c2 + c3

  println(uberCircus)
}

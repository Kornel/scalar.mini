package org.kornel.scalar.mini._07_for

object AfterForApp extends App {

  val xs = List(1, 2, 3, 4, 5, 6)

  val cs = List('a', 'b')

  val pairs = for {
    x <- xs
    c <- cs
  } yield x -> c

  println(pairs)

}

package org.kornel.scalar.mini._07_for

object BeforeForApp extends App {

  val xs = List(1, 2, 3, 4, 5, 6)

  val cs = List('a', 'b')

  val pairs = xs.flatMap(x => cs.map(c => x -> c))

  println(pairs)

}

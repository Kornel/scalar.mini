package org.kornel.scalar.mini._02_intent

object IntentFoldApp extends App {

  val xs = List(1, 2, 3, 4, 5)

  val sum = xs.foldLeft(0) {
    (acc, n) => acc + n
  }
  
  val product = xs.foldLeft(1) {
    (acc, n) => acc * n
  }
  
  println(sum)
  println(product)

}

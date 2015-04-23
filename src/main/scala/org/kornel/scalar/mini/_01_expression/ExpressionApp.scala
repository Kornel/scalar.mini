package org.kornel.scalar.mini._01_expression

object ExpressionApp extends App {

  val x = {
    10 + 20 + {
      30
    }
  }

  val y = {
    -10 - 20 - {
      30
    }
  }

  println(x + y)

}

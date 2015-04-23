package org.kornel.scalar.mini._03_caseclass

object CaseClassArityApp extends App {

  case class Person(name: String, surname: String, age: Int, weight: Int)

  case class Point(x: Int, y: Int)

  val products: List[Product] = List(Person("Johnny", "Kowalsky", 20, 80), Point(20, 10))

  products
    .map(_.productArity)
    .foreach(println)

}

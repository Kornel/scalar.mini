package org.kornel.scalar.mini._02_intent

object PowersetApp extends App {

  val elements = Set(1, 2, 3)

  def powerset(elements: Set[Int]): Set[Set[Int]] = {
    val zero = Set(Set.empty[Int])
    elements.foldLeft(zero) {
      (acc, e) => acc.union(acc.map(_ + e))
    }
  }

  println(powerset(elements))
}

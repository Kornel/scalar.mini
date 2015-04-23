package org.kornel.scalar.mini._03_caseclass

object PersonApp extends App {

  case class Person(name: String, age: Int)

  val p1 = Person("Bob", 20)
  val p2 = Person("John", 18)
  val p3 = Person("Steve", 40)
  val p4 = Person("Bob", 20)

  def areEqual(a: Person, b: Person): Unit = {
    val yesno = if (a == b) "Yes!" else "No."
    println(s"Is $a equal to $b? $yesno")
  }

  areEqual(p1, p2)
  areEqual(p2, p3)
  areEqual(p1, p4)
}

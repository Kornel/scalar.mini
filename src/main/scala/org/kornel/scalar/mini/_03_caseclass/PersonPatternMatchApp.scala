package org.kornel.scalar.mini._03_caseclass

object PersonPatternMatchApp extends App {

  case class Person(name: String, age: Int)

  val bob = Person("Bob", 20)
  val john = Person("John", 18)

  def callMeSir(p: Person): Person = p match {
    case p@Person(name, age) if age >= 18 => p.copy(name = s"Sir $name")
    case x => x
  }

  println(callMeSir(bob))
  println(callMeSir(john))

}

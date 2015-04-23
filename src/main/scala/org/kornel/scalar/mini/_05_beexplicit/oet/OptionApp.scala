package org.kornel.scalar.mini._05_beexplicit.oet

object OptionApp extends App {

  case class Person(name: String, age: Int)

  def findByAge(people: List[Person], age: Int): Option[Person] = {
    people.find(_.age == 34)
  }

  val people = Person("John", 20) :: Person("Barry", 34) :: Person("Mary", 60) :: Nil

  val byAge1 = findByAge(people, 34).getOrElse(Person("Anonymous", 0))
  val byAge2 = findByAge(people, 99).getOrElse(Person("Anonymous", 0))

  println(byAge1)
  println(byAge2)
}

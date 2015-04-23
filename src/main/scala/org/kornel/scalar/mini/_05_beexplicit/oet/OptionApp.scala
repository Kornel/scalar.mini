package org.kornel.scalar.mini._05_beexplicit.oet

object OptionApp extends App {

  case class Person(name: String, id: Int)

  def findById(people: List[Person], id: Int): Option[Person] = {
    people.find(_.id == id)
  }

  val people = Person("John", 20) :: Person("Barry", 34) :: Person("Mary", 60) :: Nil

  val byAge1 = findById(people, 34)
  val byAge2 = findById(people, 99)

  println(byAge1)
  println(byAge2)
}

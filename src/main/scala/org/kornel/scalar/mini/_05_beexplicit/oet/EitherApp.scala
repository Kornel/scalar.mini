package org.kornel.scalar.mini._05_beexplicit.oet

object EitherApp extends App {

  case class Person(name: String, age: Int)

  def findById(people: List[Person], id: Int): Either[String, Person] = {
    people.find(_.age == id) match {
      case None => Left("Did not find anyone :(")
      case Some(p) => Right(p)
    }
  }

  val people = Person("John", 20) :: Person("Barry", 34) :: Person("Mary", 60) :: Nil

  findById(people, 34).fold(
    s => println(s),
    p => println(p)
  )

  findById(people, 99).fold(
    s => println(s),
    p => println(p)
  )

}

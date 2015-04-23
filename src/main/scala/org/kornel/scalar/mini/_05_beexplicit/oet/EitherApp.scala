package org.kornel.scalar.mini._05_beexplicit.oet

object EitherApp extends App {

  case class Person(name: String, age: Int)

  def findByAge(people: List[Person], age: Int): Either[String, Person] = {
    people.find(_.age == 34) match {
      case None => Left("Did not find anyone :(")
      case Some(p) => Right(p)
    }
  }

  val people = Person("John", 20) :: Person("Barry", 34) :: Person("Mary", 60) :: Nil

  findByAge(people, 34).fold(
    s => println(s),
    p => println(p)
  )

  findByAge(people, 99).fold(
    s => println(s),
    p => println(p)
  )

}

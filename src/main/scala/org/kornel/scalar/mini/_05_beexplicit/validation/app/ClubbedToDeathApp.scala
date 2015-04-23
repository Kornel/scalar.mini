package org.kornel.scalar.mini._05_beexplicit.validation.app

import org.kornel.scalar.mini._05_beexplicit.validation._

import scalaz._
import Scalaz._

object ClubbedToDeath extends Nightclub {
  def costToEnter(p: Person): Validation[String, Double] =
    for {
      a <- checkAge(p)
      b <- checkClothes(a)
      c <- checkSobriety(b)
    } yield if (c.gender == Female) 0D else 5D

}

object ClubbedToDeathApp extends App {
  val Ken = Person(Male, 28, Set("Tie", "Shirt"), Tipsy)

  val Dave = Person(Male, 41, Set("Tie", "Jeans"), Sober)

  val Ruby = Person(Female, 25, Set("High Heels"), Tipsy)

  val people = List(Ken, Dave, Ruby, Ruby.copy(age = 17), Ken.copy(sobriety = Unconscious))

  people.map(p => p -> ClubbedToDeath.costToEnter(p))
    .foreach(t => println(s"Result for ${t._1} is ${t._2}"))

}

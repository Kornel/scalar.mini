package org.kornel.scalar.mini._05_beexplicit.validation.app

import org.kornel.scalar.mini._05_beexplicit.validation._

import scalaz.Scalaz._
import scalaz._

object ClubTropicana extends Nightclub {
  def costToEnter(p: Person): ValidationNel[String, Double] = {

    (checkAge(p).toValidationNel |@| checkClothes(p).toValidationNel |@| checkSobriety(p).toValidationNel) {
      case (_, _, c) => if (c.gender == Female) 0D else 7.5D
    }
  }
}

object ClubTropicanaApp extends App {

  val Dave = Person(Male, 41, Set("Tie", "Jeans"), Sober)
  val Ruby = Person(Female, 25, Set("High Heels"), Tipsy)

  val people = List(Dave.copy(sobriety = Paralytic), Ruby)

  people.map(p => p -> ClubTropicana.costToEnter(p))
    .foreach(t => println(s"Result for ${t._1} is ${t._2}"))

}

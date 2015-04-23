package org.kornel.scalar.mini._05_beexplicit.validation.app

import org.kornel.scalar.mini._05_beexplicit.validation._

import scalaz._
import Scalaz._

object ClubTropicana extends Nightclub {
  def costToEnter(p: Person): ValidationNel[String, Double] = {

    (checkAge(p).toValidationNel |@| checkClothes(p).toValidationNel |@| checkSobriety(p).toValidationNel) {
      case (_, _, c) => if (c.gender == Female) 0D else 7.5D
    }
  }
}

object ClubTropicanaApp {

  val Ken = Person(Male, 28, Set("Tie", "Shirt"), Tipsy)

  val Dave = Person(Male, 41, Set("Tie", "Jeans"), Sober)

  val Ruby = Person(Female, 25, Set("High Heels"), Tipsy)

  ClubTropicana.costToEnter(Dave.copy(sobriety = Paralytic))

  ClubTropicana.costToEnter(Ruby)

}

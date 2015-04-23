package org.kornel.scalar.mini._05_beexplicit.validation

import scalaz._
import Scalaz._

/**
 * Credits to: Chris Marshall
 * https://gist.github.com/oxbowlakes/970717
 */
trait Nightclub {

  def checkAge(p: Person): Validation[String, Person] = if (p.age < 18) {
    "Too Young!".failure
  } else if (p.age > 40) {
    "Too Old!".failure
  } else {
    p.success
  }

  def checkClothes(p: Person): Validation[String, Person] = if (p.gender == Male && !p.clothes("Tie")) {
    "Smarten Up!".failure
  } else if (p.gender == Female && p.clothes("Trainers")) {
    "Wear high heels".failure
  } else {
    p.success
  }

  def checkSobriety(p: Person): Validation[String, Person] = {
    if (Set[Sobriety](Drunk, Paralytic, Unconscious).contains(p.sobriety)) {
      "Sober Up!".failure
    } else {
      p.success
    }
  }
}

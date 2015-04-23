package org.kornel.scalar.mini._05_beexplicit.validation

abstract sealed class Sobriety

case object Sober extends Sobriety

case object Tipsy extends Sobriety

case object Drunk extends Sobriety

case object Paralytic extends Sobriety

case object Unconscious extends Sobriety


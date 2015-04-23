package org.kornel.scalar.mini._00_oo

object OOApp extends App {

  trait Animal {
    val name: String
  }

  trait Friendly {
    val greeting: String = "hello!"
  }

  class Dog(val name: String) extends Animal with Friendly

  val barry = new Dog("Barry")

  def greet(a: Animal with Friendly) = {
    println(a.greeting)
    println(a.name)
  }

}

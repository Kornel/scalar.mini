package org.kornel.scalar.mini._04_immutability

object ListCovariance2App extends App {

  trait Animal {
    val name: String
  }

  case class Dog(name: String) extends Animal

  case class Cat(name: String, age: Int) extends Animal

  def sayHello(animals: List[Animal]): Unit = {
    animals.foreach(name => println(s"Welcome $name"))
  }

  val dogs: List[Dog] = List(Dog("Barry"), Dog("Buddy"))
  val catsAndDogs: List[Animal] = dogs :+ Cat("A", 20)

  sayHello(catsAndDogs)
}

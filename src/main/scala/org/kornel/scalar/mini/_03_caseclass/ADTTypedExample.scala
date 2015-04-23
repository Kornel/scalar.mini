package org.kornel.scalar.mini._03_caseclass

object ADTTypedExample extends App {

  sealed abstract class List[+A]

  case object Nil extends List[Nothing]

  case class Cons[A](n: A, tail: List[A]) extends List[A]

  val list = Cons(10, Cons(20, Nil))

  def prepend[A](n: A, list: List[A]): List[A] = Cons(n, list)

  def append[A](n: A, list: List[A]): List[A] = {
    list match {
      case Nil => Cons(n, Nil)
      case Cons(x, tail) => Cons(x, append(n, tail))
    }
  }

  println(list)
  println(append(30, list))
  println(prepend(40, list))

}

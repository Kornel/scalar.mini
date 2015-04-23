package org.kornel.scalar.mini._03_caseclass

object ADTExample extends App {

  sealed abstract class List

  case object Nil extends List

  case class Cons(n: Int, tail: List) extends List
  
  val list = Cons(10, Cons(20, Nil))
  
  def prepend(n: Int, list: List): List = Cons(n, list)

  def append(n: Int, list: List): List = {
    list match {
      case Nil => Cons(n, Nil)
      case Cons(x, tail) => Cons(x, append(n, tail))
    }
  }

  println(list)
  println(append(40, list))
  println(prepend(40, list))

}

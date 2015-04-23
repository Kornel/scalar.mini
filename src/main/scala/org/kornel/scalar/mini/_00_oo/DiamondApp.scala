package org.kornel.scalar.mini._00_oo

object DiamondApp extends App {

  trait Base {
    def foo: String = " -base- "
  }

  trait A extends Base {
    override def foo = " -a- " // + super.foo
  }

  trait B extends Base {
    override def foo = " -b- " // + super.foo
  }

  class C extends A with B with Base

  val cC: C = new C
  val cBase: Base = new C
  val cA: A = new C
  val cB: B = new C

  println(cBase.foo)
  println(cA.foo)
  println(cB.foo)
  println(cC.foo)

}

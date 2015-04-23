package org.kornel.scalar.mini._02_intent

object IntentApp extends App {

  val years = List(1980, 1985, 1990, 1995, 2000, 2010, 2014)

  val today = 2015

  years.map(x => today - x)
    .filter(x => x >= 18)
    .foreach(x => println(x))

  years.map(today - _)
    .filter(_ >= 18)
    .foreach(println)

}

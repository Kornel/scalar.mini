package org.kornel.scalar.mini._07_for

object GenerateApp extends App {

  val all = AllCombinations(List('0', '1'), 4)

  all.foreach(println)
}

object AllCombinations {

  def apply(alphabet: List[Char], length: Int): List[List[Char]] = generate(alphabet, length)

  private def generate(data: List[Char], length: Int): List[List[Char]] = {
    if (length == 0) {
      List(List())
    } else {
      for {
        x <- data
        xs <- generate(data, length - 1)
      } yield x :: xs
    }

  }
}


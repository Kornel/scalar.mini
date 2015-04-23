package org.kornel.scalar.mini._06_currying

object CurringExampleDIApp extends App {

  abstract class User(name: String)

  abstract class Connection(instance: String) {
    def fetch(id: String): User
  }

  def getUserName(id: String): Connection => User = {
    c => c.fetch(id)
  }

}

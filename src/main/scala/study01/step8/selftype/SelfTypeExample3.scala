package study01.step8.selftype

object SelfTypeExample3 extends App {
  trait Animal

  trait DBSaveable {
    val DbSession = "I am a DB session!"
    def save(animal: Animal): Unit = print(DbSession)
  }

  trait DifferentDBSaveable extends DBSaveable {
    override val DbSession =
      "I am a different DB session that does cooler things~~!!!!"
  }

  class Cat(gender: String, age: Int) extends Animal {
    self: DBSaveable =>
    def register: Unit = save(this)
    def sleep: String = "zzZZzz"
    def feed: String = "Cat food"
  }

  val cat = new Cat("girl", 1) with DifferentDBSaveable
  cat.register

}

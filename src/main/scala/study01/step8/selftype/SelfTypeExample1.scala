package study01.step8.selftype

object SelfTypeExample1 extends App {
  trait Animal

  trait DBSaveable {
    val DbSession = "I am a DB session!"
    def save(animal: Animal): Unit = print(DbSession)
  }
  case class Cat(gender: String, age: Int) extends Animal with DBSaveable {
    def register: Unit = save(this)
    def sleep: String = "zzZZzz"
    def feed: String = "Cat food"
  }

  case class Dog(gender: String, age: Int) extends Animal with DBSaveable {
    def sleep: String = "zzZZzz"
    def feed: String = "Dog Food"
  }

  val cat = Cat("girl", 1)
  cat.register

}

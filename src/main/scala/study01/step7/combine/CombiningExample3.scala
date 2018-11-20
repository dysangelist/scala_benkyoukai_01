package study01.step7.combine

object CombiningExample3 extends App {
  object Owner {
    def feed(animal: Animal): Unit = println(animal.feed)
  }

  trait Animal {
    def sleep: String = "zzZZzz"
    def feed: String
  }

  case class Cat(gender: String, age: Int) extends Animal {
    def feed: String = "Cat food"
  }

  case class Dog(gender: String, age: Int) extends Animal {
    def feed: String = "Dog Food"
  }

  Owner.feed(Cat("girl", 1))
  Owner.feed(Dog("boy", 1))

}

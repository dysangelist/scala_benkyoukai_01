package study01.step7.combine

import study01.step7.combine.CombiningExample4.Pettable

object CombiningExample4 extends App {

  trait Pettable {
    def pet: Unit = println("I am being petted~!")
  }
  trait Animal {
    def sleep: String = "zzZZzz"
    def feed: String
  }

  case class Cat(gender: String, age: Int) extends Animal with Pettable {
    def feed: String = "Cat food"
  }

  case class Dog(gender: String, age: Int) extends Animal {
    def feed: String = "Dog Food"
  }

  val cat = Cat("girl", 1)
  val dog = Dog("boy", 1)
  cat.pet

}

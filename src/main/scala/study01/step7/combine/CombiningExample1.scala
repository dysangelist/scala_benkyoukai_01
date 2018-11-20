package study01.step7.combine

object CombiningExample1 extends App {
  trait Animal

  case class Cat(gender: String, age: Int) extends Animal {
    def sleep: String = "zzZZzz"
    def feed: String = "Cat food"
  }

  case class Dog(gender: String, age: Int) extends Animal {
    def sleep: String = "zzZZzz"
    def feed: String = "Dog Food"
  }

  def printAnimal(animal: Animal): Unit = {
    println(animal)
  }

  printAnimal(Cat("girl", 1))
  printAnimal(Dog("boy", 1))

}

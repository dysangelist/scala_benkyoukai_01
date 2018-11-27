package study01.step4.caseclass

object CaseClassExample1 extends App {

  case class Dog(gender: String, age: Int) {
    def sleep: String = "zzZZzz"
    def feed: String = "Dog Food"
  }

  val dog: Dog = Dog("boy", 1)

  val dog2: Dog = Dog("girl", 2)


  dog.age
  println(dog)
  println(dog2)

}

package study01.step5.objects

import study01.step4.caseclass.CaseClassExample1.Dog

object ObjectExample1 extends App {
  object Owner {
    def feed(dog: Dog): Unit = println(dog.feed)
  }

  import Owner._
  val dog = Dog("boy", 1)
  Owner.feed(dog)

}

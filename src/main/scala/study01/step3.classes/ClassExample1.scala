package study01.step2.step3.classes

object ClassExample1 extends App {

  class Cat(gender: String, age: Int) {
    def sleep: String = "zzZZzz"
    def feed: String = "cat food"
  }
  val cat: Cat = new Cat("girl", 1)
  println(cat.feed)
  println(cat.sleep)

  val cat2: Cat = new Cat("boy", 2)

  println(cat)
  println(cat2)

}

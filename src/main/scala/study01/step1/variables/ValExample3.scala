package study01.step1.variables

object ValExample3 extends App {
  var one: Int = 1

  println(one)

  var two: Int = 2

  println(two)

  val three = one + two

  println(three)

  one = 2

  println(three)
}

package study01.step2.methods

object MethodExample3 extends App {
  var one = 1

  def change() = {
    one = one + 1
    one
  }

  println(change())
  println(change())

}

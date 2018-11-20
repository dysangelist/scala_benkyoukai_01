package study01.step2.methods

//Arity
object MethodExample2 extends App {
  val hello: String = "Hello, world!"
  def helloWorld(): Unit = println(hello)
  def helloSize: Int = hello.length

  helloWorld()
  println(helloSize)

  helloWorld
}

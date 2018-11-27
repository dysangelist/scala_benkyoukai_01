package study01.step9.valueclass

object ValueClassExample1 extends App {
  case class Centimeter(value: Float) {
    def +(other: Centimeter): Centimeter = Centimeter(value + other.value)
    def toMeter: Meter = Meter(value / 100)
  }

  case class Meter(value: Float) {
    def +(other: Meter): Meter = Meter(value + other.value)
    def toCentimeter: Meter = Meter(value / 100)
  }

  println(Meter(1) + Meter(1))

  println(Meter(1) + Centimeter(15).toMeter)

}

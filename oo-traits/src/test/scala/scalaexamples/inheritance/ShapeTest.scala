package scalaexamples.inheritance

import org.scalatest.FunSuite

class ShapeTest extends FunSuite {

  val rectangle = new Rectangle(4.0, 10.0, Shape.DefaultColor)
  val circle = new Circle
  val square = new Square

  val shapes = List(rectangle, circle, square)
  
  test("testArea") {
    assert(40.0 == rectangle.area)
    // Make this compile and run
    // assert(Pi * 3.0 * 3.0 == circle.area)
    // assert(4.0 == square.area)
  }
  
  test("testCircumference") {
    assert(28.0 == rectangle.circumference)
    // Make this compile and run
    // assert(2 * Pi * 3.0 == circle.circumference)
    // assert(8.0 == square.circumference)
  }
  
  test("testColor") {
    // Make this compile and run
    // shapes foreach { shape => assert(Shape.DefaultColor == shape.color) }
  }
}

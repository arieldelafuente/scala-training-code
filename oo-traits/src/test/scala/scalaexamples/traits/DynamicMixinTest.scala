package scalaexamples.traits

import org.scalatest.FunSuite

class DynamicMixinTest extends FunSuite {

  test("mixInTraitTest") {
    val myElement = new Element(0)

    // Make the following compile and run. 
    // Hint this is easy to achieve by mixing in the correct 
    // trait right here when creating the instance of Element.

    // assert("a value" == myElement.mixedInMethod)
    val anotherElement = new Element(0) with MethodTrait
    assert("another value" == anotherElement.mixedInMethod)
  }

  test("mixInInterfaceTest") {
    // Make the following compile and run (uncomment the code)
    // Hint you can open the class or subclass it right here.

    // val myElement = new Element(0) with InterfaceTrait
    // assertNotNull(myElement.getSomeString)
  }

  test("stackableTraitTest") {
    // Make the following run without assertion error.
    // Hint: extend ElementWithStackableTrait with Element and SubClassTrait
    class ElementWithStackableTrait(value: Int)
    val element = new ElementWithStackableTrait(1)
    assert("stacked toString, super toString is 'anIntValue is 1'" == element.toString)
  }

}

package scalaexamples.traits

import org.scalatest.FunSuite

class BasicTraitTest extends FunSuite {
  
  val list = List(new Element(10), new Element(2))
  
  test("mixInOrderedTraitTest") {
      // Make the following compile (and run of course)
	  // Hint implement the Ordered interface on the Element class

	  // assert((list(0) compare list(1)) > 0)
	  // assert(list(0) > list(1))
	  // assert(list(0) >= list(1))
	  // assert(!(list(0) < list(1)))
	  // assert(!(list(0) <= list(1)))
  }
  
}

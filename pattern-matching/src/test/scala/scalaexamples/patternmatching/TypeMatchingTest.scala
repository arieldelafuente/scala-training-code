package scalaexamples.patternmatching

import org.scalatest.FunSuite

class TypeMatchingTest extends FunSuite {
  
  test("matchOnType") {
	val elements = List(23, "Hello", 8.5, 'q') 
	for (element <- elements) { 
	  element match { 
	    // Make test run, and assert on types, e.g. " => assertEquals(23, integer)" or " => assertEquals("Hello", s)"
	    // Insert your matching code here
	    case other => sys.error("Should match other on type")
	 }
	}
  }

}

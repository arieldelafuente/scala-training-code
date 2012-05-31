package scalaexamples.intro

import org.scalatest.FunSuite

class CreateStuffTest extends FunSuite {

  val stuff = new Stuff
  
  test ("accessOverridenToString") {
    assert(stuff.toString == "Stuff")
  }
  
  test ("accessVal") {
    (pending)
    // Make this compile and run
  	// assertEquals("This is a constant", stuff.const)
   
    // When commenting in the following line, you must get a compile error
  	// stuff.const = "Must give compile error"  
  }
  
  test ("changeVar") {
    (pending)
    // Make this compile and run 
    
    // assertEquals("This is a variable", stuff.variable)
    val text = "Changed it"
    // stuff.variable = text
    // assertEquals(text, stuff.variable)
  }
  
  test ("accessStuffObject") {
    (pending)
    // Make this compile and run
    //assertEquals("StuffObject", Stuff.getString)    
  }
  
  test ("testSayHello") {
    (pending)
    // Make this compile and run
    // assertEquals("Hello Alf", stuff.sayHello("Alf"))    
  }
  
  test ("testPrintHello") {
    // Make this compile and run
    // assertEquals((), stuff.printHello("Alf"))    
  }
  
}

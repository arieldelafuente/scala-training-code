package scalaexamples.companionobject

import org.scalatest.FunSuite

class CompanionObjectTest extends FunSuite{

  test("companionObjectTest") {
    // Comment in expression by expression and make them compile and run
    // Hint: You do this by changing the Train.scala definition. More hints in the source file.
    
    // val trainOne = Train(Array("Espen"))
    // assert(List("Espen") == trainOne.passengers)
    // assert(trainOne.conductor.isEmpty)
    
    // val trainTwo = Train("Per", "Pål")
    // assert(List("Per", "Pål") == trainTwo.passengers)
    // assert(trainTwo.conductor.isEmpty)
    
    // val trainObject = Train
    // val trainThree = trainObject(Array("Espen"))
    // assert(List("Espen") == trainThree.passengers)
    // assert(trainThree.conductor.isEmpty)

    // val trainFour = trainObject.apply(Some("conductor"), "Espen")
    // assert(List("Espen") == trainFour.passengers)
    // assert(trainFour.conductor.isDefined)

  }
  
}
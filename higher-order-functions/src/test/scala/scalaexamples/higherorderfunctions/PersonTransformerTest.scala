package scalaexamples.higherorderfunctions

import org.scalatest.FunSuite

// Comment in the tests below and make them run and pass

class PersonTransformerTest extends FunSuite {

  val personTransformer = new PersonTransformer

  val alf = Person("Alf", 30, List(EmailAddress("alf.kristian@gmail.com")))
  val fredrik = Person("Fredrik", 33, List(EmailAddress("fredrik@vraalsen.no"), EmailAddress("fvr@knowit.no")))
  val johannes = Person("Johannes", 0, Nil)

  val persons = alf :: fredrik :: johannes:: Nil

  test ("testEquals") {
    // Pass in a function that returns the list of persons unchanged
    // assert(persons == personTransformer.transformPersons(persons, error("")))
  }

  test ("testName") {
    // Pass in a function transforming the list to the names of the persons
    val expected = List("Alf", "Fredrik", "Johannes")
    // assert(expected == personTransformer.transformPersons(persons, error("")))
    ()
  }
  
  test ("testAge") {
    // Pass in a function transforming the list to the ages of the persons
    val expected = List(30, 33, 0)
    // assert(expected == personTransformer.transformPersons(persons, error("")))
    ()
  }
  
}

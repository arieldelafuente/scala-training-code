package scalaexamples.higherorderfunctions

import org.scalatest.FunSuite

// Comment in the tests below and make them run and pass

class PersonFilterTest extends FunSuite {
  
  val personFilter = new PersonFilter
  
  val alf = Person("Alf", 30, List(EmailAddress("alf.kristian@gmail.com")))
  val fredrik = Person("Fredrik", 33, List(EmailAddress("fredrik@vraalsen.no"), EmailAddress("fvr@knowit.no")))
  val johannes = Person("Johannes", 0, Nil)

  val persons = alf :: fredrik :: johannes :: Nil
  
  test ("testAll") {
    // Pass in a function that returns all persons (always true)
    // assert(persons == personFilter.filterPersons(persons, error("")))
  }
  
  test ("testNone") {
    // Pass in a function that returns no persons (always false)
    // assert(Nil == personFilter.filterPersons(persons, error("")))
  }
  
  test ("testEmptyList") {
    // Use the two functions from above to test personFilter on empty lists (Nil)
    // assert(Nil == personFilter.filterPersons(Nil, error("")))
    // assert(Nil == personFilter.filterPersons(Nil, error("")))
  }

  test ("testOld") {
    // Pass in a function that returns the persons over 18
    // assert(List(alf, fredrik) == personFilter.filterPersons(persons, error("")))
  }

  test ("testYoung") {
    // Pass in a function that returns the persons under 18
    // assert(List(johannes) == personFilter.filterPersons(persons, error("")))
  }

}

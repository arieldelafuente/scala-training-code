package scalaexamples.higherorderfunctions

import org.scalatest.FunSuite

// Comment in the tests below and make them run and pass

class PersonPartitionerTest extends FunSuite {

  val partitioner = new PersonPartitioner

  val alf = Person("Alf", 30, List(EmailAddress("alf.kristian@gmail.com")))
  val fredrik = Person("Fredrik", 33, List(EmailAddress("fredrik@vraalsen.no"), EmailAddress("fvr@knowit.no")))
  val johannes = Person("Johannes", 0, Nil)

  val persons = alf :: fredrik :: johannes :: Nil

  test ("testAgeLimit") {
    // Pass in a function that tests whether the person is an adult
    val (adults, kids) = (Nil, Nil) // partitioner.partitionPersons(persons, error(""))

    assert(List(alf, fredrik) == adults)
    assert(List(johannes) == kids)
  }

  test ("testHasMoreThanOneEmail") {
    // Pass in a function that tests whether the person is
    // a techie (2 or more e-mail addresses) or a luddite (zero or one e-mail address)
    val (techies, luddites) = (Nil, Nil) // partitioner.partitionPersons(persons, error(""))

    assert(List(fredrik) == techies)
    assert(List(alf, johannes) == luddites)
  }

}

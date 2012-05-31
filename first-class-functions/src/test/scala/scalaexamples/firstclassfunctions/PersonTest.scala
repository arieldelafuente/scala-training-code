package scalaexamples.firstclassfunctions

import org.scalatest.FunSuite

// Comment in the tests below and make them run and pass

// The objective in each exercise is to 
// transform the list 'persons' in some way,
// using the functions filter, map etc. on the list

class PersonTest extends FunSuite {

  val alf = Person("Alf", 30, List(EmailAddress("alf.kristian@gmail.com")))
  val fredrik = Person("Fredrik", 33, List(EmailAddress("fredrik@vraalsen.no"), EmailAddress("fvr@knowit.no")))
  val johannes = Person("Johannes", 0, Nil)
  val persons = List(alf, fredrik, johannes)

  test("testAdults") {
    // Filter the list of persons to find all adults
    val adults = Nil

    assert(List(alf, fredrik) == adults)
  }

  test("testName") {
    // Find the names of all persons
    val names = Nil

    assert(names == List("Alf", "Fredrik", "Johannes"))
  }

  test("testNamesOfAdults") {
    // Create a list containing the names of the adults,
    // by combining the approaches in the two exercies above    
    val names = Nil

    assert(names == List("Alf", "Fredrik"))
  }

  test("testAgeLimit") {
    // Partition the list of persons into two new lists,
    // one containing the adults and one containing the kids
    val (adults, kids) = (Nil, Nil)

    assert(List(alf, fredrik) == adults)
    assert(List(johannes) == kids)
  }

  test("testHasMultipleEmails") {
    // Split the list of persons into two new lists containing
    // techies (more than one email address) and luddites (zero or only one email address)
    val (techies, luddites) = (Nil, Nil)

    assert(List(fredrik) == techies)
    assert(List(alf, johannes) == luddites)
  }

  test("testFindByName") {
    // Find the person named "Johannes" in the list of persons
    val name = "Johannes"
    val person: Option[Person] = null

    person match {
      case Some(person) => assert(johannes == person)
      case _ => sys.error("No match")
    }
    
  }
  
  test ("testFindByName2") {
    // Find the person named "Jon-Anders" (should not match)
    val name = "Jon-Anders"
    val person: Option[Person] = null

    person match {
      case None => "OK"
      case _ => sys.error("Unexpected match")
    }
  }
  
  test ("testFindEmailAddressesByName") {
    // Find the e-mail addresses of the person named "Alf". 
    // Here you must first find the person, 
    // then map the collection to a different type    
    val name = "Alf"
    val addresses: Option[List[EmailAddress]] = null

    addresses match {
      case Some(addresses) => assert(alf.emailAddresses == addresses)
      case _ => sys.error("No match")
    }    
  }
  
  test ("testFindPersonByEmail") {
    // Find the person who has the e-mail address "fvr@knowit.no".

    // Hint: Try combinining finding the person and checking if
    // there exists an email address matching the criteria in the
    // person's list of email addresses.    
    val address = EmailAddress("fredrik@vraalsen.no")
    val person: Option[Person] = null

    person match {
      case Some(person) => assert(fredrik == person)
      case _ => sys.error("No match")
    }    
  }
  
  test ("testGetFirstEmailAddress") {
    // Create a new list of the first e-mail address of each person,
    // filtering out persons without e-mail addresses. 

    // Hint: Try combining filtering the list and then 
    // mapping it to a different type, only getting
    // the head of the email address list.    
    val addresses = Nil

    assert(List(alf.emailAddresses.head, fredrik.emailAddresses.head) == addresses)    
  }
  

  test ("testNameToEmailAddress") {
    // Create a map from each persons name to their e-mail addresses,
    // filtering out persons without e-mail addresses
    // Hint: First filter list, then use foldLeft to accumulate...
    val emptyMap: Map[String, List[EmailAddress]] = Map()

    // Insert code here for emptyMap
    val nameToEmail = emptyMap

    assert(Map(alf.name -> alf.emailAddresses, fredrik.name -> fredrik.emailAddresses) == nameToEmail)
  }

}

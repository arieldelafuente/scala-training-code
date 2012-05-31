package scalaexamples.patternmatching

import org.scalatest.FunSuite

class RegexMatchingTest extends FunSuite {

  test("matchEntireString") {
    val string = "This is the string to find a match for."

    // "(string)".r makes a Scala regular expression, which may be used in matching.
    // The syntax to use it in a match expression is
    //  
    //    case myregex(one) => ...
    //  
    // The match extracts the contents within the 
    // capturing parentheses () in the regular expression.
    val matchRegex = "(.+)".r

    val mathedElement = string match {
      // Insert you match statement here
      case _ => "Failed"
    }

    assert(string == mathedElement)
  }

  test("matchFirstPartOfString") {
    val start = "This is"
    val string = start + " the string to find a match for."
    val matchRegex = """^(\w+\s\w+).*""".r

    val mathedElement = string match {
      // Insert you match statement here
      case _ => "Failed"
    }

    assert(start == mathedElement)
  }

  test("matchFirstAndLastWordOfString") {
    val start = "This"
    val end = "for"
    val string = start + " is the string to find a match " + end

    // Create a regular expression which will make the folliwing match and assertions correct.
    val matchRegex = """""".r

    val (first, last) = string match {
      case matchRegex(firstElement, lastElement) => (firstElement, lastElement)
      case _ => "Failed"
    }

    assert(start == first)
    assert(end == last)
  }

  test("matchEmails") {

    // Create a regex which identifies email (may be really simple)
    // val emailRegex = """([^@]+)@(.+)""".r
    // You may use the regex above.
    val emailRegex = """""".r

    def isValidEmail(stringToTest: String) = stringToTest match {
      // Insert you match statement here
      case _ => false
    }

    assert(isValidEmail("aks@knowit.no"))
    assert(isValidEmail("alf.kristian@gmail.com"))
    assert(isValidEmail("fvr_at_knowit.no"))

  }

}

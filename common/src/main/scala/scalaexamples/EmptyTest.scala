package scalaexamples

import org.scalatest.FunSuite
import org.scalatest.FeatureSpec

class EmptyTest extends FunSuite {

  // Write a unit test. Make it fail, and then make it pass.

  test("some test case")(pending)

  test("some expects test case") {
    expect("a value we expect")("a value we expect")
  }

  test("some assert test case") {
    assert(1 == 1)
  }
}

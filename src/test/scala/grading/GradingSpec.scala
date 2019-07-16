package grading

import org.scalatest.{FlatSpec, Matchers}

final class GradingSpec extends FlatSpec with Matchers {

  private val testCases = List(
    TestCase(73, 75),
    TestCase(67, 67),
    TestCase(38, 40),
    TestCase(33, 33)
  )

  testCases.foreach {
    case TestCase(grade, expected) =>
      s"Grading Rounder" should s"convert $grade to be $expected" in {
        Grading.gradingStudents(grade) should be(expected)
      }
  }

}

case class TestCase(grade:Int, expected:Int)

package timeConversion

import org.scalatest.{FlatSpec, Matchers}

final class TimeConversionSpec extends FlatSpec with Matchers {
  case class TestCase(twelveHour: String, twentyFourHour: String)

  private val testCases = List(
    TestCase("07:05:45PM", "19:05:45")
    , TestCase("00:00:00AM", "00:00:00")
    , TestCase("01:15:45AM", "01:15:45")
    , TestCase("12:00:00PM", "12:00:00")
  )

  testCases.foreach {
    case TestCase(twelveHour, twentyFourHour) =>
    s"TimeConversion" should s"convert $twelveHour to $twentyFourHour" in {
      TimeConversion.timeConversion(twelveHour) should be(twentyFourHour)
    }
  }

}


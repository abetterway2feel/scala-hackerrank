package kangaroo

import kangaroo.KangarooCircus.Kangaroo
import kangaroo.KangarooSpec.TestCase
import org.scalatest.{FlatSpec, Matchers}


final class KangarooSpec extends FlatSpec with Matchers {

  private val testCases = List(
    TestCase(Kangaroo(0, 3), Kangaroo(4, 2), kangaroosMeet = true),
    TestCase(Kangaroo(0, 2), Kangaroo(5, 3), kangaroosMeet = false),
    TestCase(Kangaroo(4523, 8092), Kangaroo(9419, 8076), kangaroosMeet = true),
    TestCase(Kangaroo(1817, 9931), Kangaroo(8417, 190), kangaroosMeet = false)
  )


  testCases.foreach {
    case TestCase(kangaroo1, kangaroo2, false) =>
      s"KangarooCircus" should s"calculate that $kangaroo1 and $kangaroo2 will NOT meet" in {
        KangarooCircus.kangaroo(kangaroo1, kangaroo2) should be(false)
      }

    case TestCase(kangaroo1, kangaroo2, true) =>
      s"KangarooCircus" should s"calculate that $kangaroo1 and $kangaroo2 will meet" in {
        KangarooCircus.kangaroo(kangaroo1, kangaroo2) should be(true)
      }

  }

}


object KangarooSpec {

  case class TestCase(kangaroo1: Kangaroo, kangaroo2: Kangaroo, kangaroosMeet: Boolean)

}



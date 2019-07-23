package DynamicArray

import org.scalatest.{FreeSpec, Matchers}

final class DynamicArraySpec extends FreeSpec with Matchers {

  "A DynamicArray should perform the queries as described in the puzzle description" in {
    val lastAnswers = DynamicArray.dynamicArray(2,
      Array(
        Array(1, 0, 5),
        Array(1, 1, 7),
        Array(1, 0, 3),
        Array(2, 1, 0),
        Array(2, 1, 1))
    )

    lastAnswers should be(Array(7, 3))
  }
}





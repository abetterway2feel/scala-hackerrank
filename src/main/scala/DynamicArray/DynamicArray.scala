package DynamicArray


final class DynamicArray(val sequences: Int) {

  def query(query: Array[Int]): Unit = {

    query.toList match {
      case 1 :: x :: y =>
        val index = (x ^ lastAnswer()) % sequences
        val sequence = seqList(index)
        seqList(index) = sequence ++ y
      case 2 :: x :: y :: _  =>
        val index = (x ^ lastAnswer()) % sequences
        val sequence = seqList(index)
        _lastAnswers = _lastAnswers ++ Array(sequence(y % sequence.length))
      case _ => throw new NotImplementedError("Only Query 1 and 2 have been implemented")
    }
  }

  def lastAnswers: Array[Int] = _lastAnswers

  private def lastAnswer(): Int = _lastAnswers.takeRight(1).headOption.getOrElse(0)

  private var _lastAnswers: Array[Int] = Array.empty[Int]

  private val seqList = {
    val seqList = Array.ofDim[Array[Int]](sequences)
    seqList.map(_ => List.empty[Int])
  }

}

object DynamicArray{

  def dynamicArray(n: Int, queries: Array[Array[Int]]): Array[Int] = {

    val dynamicArray = new DynamicArray(n)
    queries.foreach(dynamicArray.query)

    dynamicArray.lastAnswers
  }
}

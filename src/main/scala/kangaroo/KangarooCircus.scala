package kangaroo

object KangarooCircus {

  case class Kangaroo(startsAt: Int, moves: Int)


  // Complete the kangaroo function below.
  def kangaroo(kangaroo1: Kangaroo, kangaroo2: Kangaroo): Boolean = {
    (kangaroo1, kangaroo2) match {
      case (Kangaroo(x1, v1), Kangaroo(x2, v2))
        if x1 < x2 && v1 <= v2 => false
      case (Kangaroo(x1, v1), Kangaroo(x2, v2))
        if x2 < x1 && v2 <= v1 => false
      case _ =>
        (kangaroo1.startsAt - kangaroo2.startsAt) % (kangaroo2.moves - kangaroo1.moves) == 0
    }
  }

  // Complete the kangaroo function below.
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String = {
    if (kangaroo(Kangaroo(x1, v1), Kangaroo(x2, v2))) {
      "YES"
    }
    else {
      "NO"
    }
  }

}

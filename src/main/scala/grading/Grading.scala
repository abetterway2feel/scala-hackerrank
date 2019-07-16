package grading

object Grading {

  /*
   * Complete the 'gradingStudents' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts INTEGER_ARRAY grades as parameter.
   */

  def gradingStudents(grades: Array[Int]): Array[Int] = {
    grades.map(gradingStudents)
  }

  def gradingStudents(grade: Int): Int = {
    val rounding = grade % 5
    if(grade > 37 & rounding >= 3) {
      grade + (5 - rounding)
    }
    else {
      grade
    }
  }

}

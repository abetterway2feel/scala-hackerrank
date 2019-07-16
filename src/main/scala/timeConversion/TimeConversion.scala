package timeConversion

object TimeConversion {

  /*
   * Complete the timeConversion function below.
   */
  def timeConversion(s: String): String = {
    val pattern = """(\d{2}):(\d{2}):(\d{2})(PM|AM)""".r

    val pattern(hour, min, second, amOrPM) = s

    val militaryHour = amOrPM.toUpperCase() match {
      case "AM" =>
        hour match {
          case "12" => "00"
          case  h => h
        }
      case "PM" =>
        hour match {
          case "12" => "12"
          case  h => (h.toInt + 12).toString
        }
      case _ =>
        //should never happen
    }

    s"$militaryHour:$min:$second"
  }
}

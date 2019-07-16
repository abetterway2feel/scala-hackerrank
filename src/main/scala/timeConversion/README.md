
From: <https://www.hackerrank.com/challenges/time-conversion/problem>

Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description

Complete the timeConversion function in the editor below. It should return a new string representing the input time in 24 hour format.

timeConversion has the following parameter(s):

s: a string representing time in  hour format
Input Format

A single string  containing a time in -hour clock format (i.e.:  or ), where  and .

Constraints

All input times are valid
Output Format

Convert and print the given time in -hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45




----
Interesting solution from:
<https://www.hackerrank.com/rest/contests/master/challenges/time-conversion/hackers/gengmao/download_solution>


object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val input = readLine
    val time = input.dropRight(2).split(":").map(_.toInt)
    var hour = time(0)
    val min = time(1)
    val sec = time(2)
    if (input.endsWith("AM")) {
      hour %= 12
    } else {
      hour = hour%12 + 12
    }
    printf("%02d:%02d:%02d", hour, min, sec)
  }
}

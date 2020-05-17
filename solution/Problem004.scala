import scala.annotation.tailrec

object Problem004 {
  def isPalindrome(x: String): Boolean =
    if (x.length() <= 1) true
    else if (x.charAt(0) == x.charAt(x.length()-1))
      isPalindrome(x.substring(1, x.length()-1))
    else false

  def solve(): Int = {
    def inner(a: Int, b: Int, largest: Int): Int =
      if (b < 100)
        largest
      else if (a < 100)
        inner(999, b-1, largest)
      else {
        val p = a * b
        if (isPalindrome(p.toString) && p > largest)
          inner(a-1, b, a*b)
        else
          inner(a-1, b, largest)
      }
    inner(999, 999, 0)
  }

  def main(args: Array[String]) =
    println(solve())
}

object Problem002 {
  def isPerfectSquare(x: Long): Boolean = {
    val r = Math.sqrt(x).toLong
    r*r == x
  }

  def isFibonacci(x: Int): Boolean =
    isPerfectSquare(5L*x*x + 4) || isPerfectSquare(5L*x*x - 4)

  def solve(): Int =
    (1 to 4000000)
      .filter(isFibonacci(_))
      .filter(_ % 2 == 0)
      .foldLeft(0)(_ + _)

  def main(args: Array[String]) = {
    println(solve())
  }
}

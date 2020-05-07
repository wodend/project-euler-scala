object Problem001 {
  def solve(): Int =
    (1 until 1000).filter(x => x % 3 == 0 || x % 5 == 0).foldLeft(0)(_ + _)

  def main(args: Array[String]) = {
    println(solve())
  }
}

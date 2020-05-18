object Problem005 {
  // Skip factors of 20
  def isDivisible(n: Int): Boolean =
    if (n % 3 == 0
        && n % 6 == 0
        && n % 7 == 0
        && n % 8 == 0
        && n % 9 == 0
        && n % 11 == 0
        && n % 12 == 0
        && n % 13 == 0
        && n % 14 == 0
        && n % 15 == 0
        && n % 16 == 0
        && n % 17 == 0
        && n % 18 == 0
        && n % 19 == 0) true else false

  def solve(): Int =
    (2520 to Int.MaxValue by 20).iterator.find(isDivisible(_)).getOrElse(0)

  def main(args: Array[String]) =
    println(solve())
}

import scala.annotation.tailrec

object Problem003 {
  def millerRabinRD(n: Long): (Long, Long) = {
    def inner(r: Long): (Long, Long) = {
      val d = (n - 1)/scala.math.pow(2, r)
      if (d == d.toLong && d % 2 != 0)
        (r, d.toLong)
      else
        inner(r+1)
    }
    inner(2)
  }

  // TODO: Implement more efficient prime test to solve this in < 1 minute
  def isPrime(x: Long): Boolean =
    (3L to Math.sqrt(x).toLong by 2).filter(x % _ == 0).length == 0

  def factorStream(n: Long): Stream[Long] = {
    def inner(x: Long): Stream[Long] =
      if (x <= 0)
        Stream.empty
      else if (n % x == 0)
        Stream.cons(x, inner(x-1))
      else
        inner(x-1)
    inner(n-1)
  }

  def primeStream(n: Long): Stream[Long] = {
    def inner(x: Long): Stream[Long] =
      if (x == 0)
        Stream.empty
      else if (isPrime(x))
        Stream.cons(x, inner(x-1))
      else
        inner(x-1)
    inner(n)
  }

  def solve(): Long = {
    //val n = 600851475143L
    //primeStream(n).find(n % _ == 0).getOrElse(0)
    //factorStream(600851475143L).find(isPrime(_)).getOrElse(0)
    //factorStream(13195L).find(isPrime(_)).getOrElse(0)
  }

  def main(args: Array[String]) = {
    println(solve())
  }
}

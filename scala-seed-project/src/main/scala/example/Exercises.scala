package example

object Main extends App {
  println(Exercises.fibonacci(0))
  println(Exercises.fibonacci(1))
  println(Exercises.fibonacci(2))
  println(Exercises.fibonacci(3))

  print(Exercises.isSorted(Array(1,2,3,5), (x: Int,y: Int) => x < y))
  print(Exercises.isSorted(Array(5, 4 ,2, 7), (x: Int,y: Int) => x < y))

}

object Exercises {
  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def go(d: Int, acc: Int, bcc: Int): Int = {
      if (d <= 0) bcc
      else go(d - 1, acc + bcc, acc)
    }

    go(n, 1, 0)
  }


  //fib(5) = 5 => fib(4) + fib(3) = 3+2
  // go(5, 1, 0) => go(4, 1,0) => go(3,2,1) => go(2,3,2) => go(1,5,3) => go(0,8,5)


  // Polymorphic functions
  // Exercise 2.2
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    as match {
      case Array() | Array(_) => true
      case _ => as.sliding(2).forall { case Array(x, y) => ordered(x,y)}
    }
  }

  // Exercise 2.3
  def curry[A, B, C](f: (A,B) => C): A => (B => C) = {
    (a: A) => (b: B) => f(a, b)
  }

  // Exercise 2.4
  def uncurry[A, B, C](f: A => B => C): (A, B) => C = {
    (a: A, b: B) => f(a)(b)
  }

  // Exercise 2.5
  def compose[A, B, C](f: B => C, g: A => B): A => C = (a: A) => f(g(a))
}


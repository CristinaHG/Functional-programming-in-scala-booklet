package example

object Main extends App {
  println(Exercises.fibonacci(0))
  println(Exercises.fibonacci(1))
  println(Exercises.fibonacci(2))
  println(Exercises.fibonacci(3))
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
}


//fib(5) = 5 => fib(4) + fib(3) = 3+2

// go(5, 1, 0) => go(4, 1,0) => go(3,2,1) => go(2,3,2) => go(1,5,3) => go(0,8,5)
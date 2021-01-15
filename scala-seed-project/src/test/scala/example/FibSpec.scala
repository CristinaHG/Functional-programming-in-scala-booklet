package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class FibSpec extends AnyFlatSpec with Matchers {
  "The Fibonacci method" should "output correct fibonacci value" in {
    Exercises.fibonacci(0) shouldBe 0
    Exercises.fibonacci(1) shouldBe 1
    Exercises.fibonacci(2) shouldBe 1
    Exercises.fibonacci(3) shouldBe 2
    Exercises.fibonacci(4) shouldBe 3
    Exercises.fibonacci(5) shouldBe 5
    Exercises.fibonacci(6) shouldBe 8
    Exercises.fibonacci(7) shouldBe 13
    Exercises.fibonacci(8) shouldBe 21
    Exercises.fibonacci(9) shouldBe 34
    Exercises.fibonacci(10) shouldBe 55
    Exercises.fibonacci(11) shouldBe 89
    Exercises.fibonacci(12) shouldBe 144
    Exercises.fibonacci(13) shouldBe 233
    Exercises.fibonacci(14) shouldBe 377
    Exercises.fibonacci(15) shouldBe 610
    Exercises.fibonacci(16) shouldBe 987
    Exercises.fibonacci(17) shouldBe 1597
  }
}

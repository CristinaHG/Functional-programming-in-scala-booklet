package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class polymorphicSpec extends AnyFlatSpec with Matchers {
  "An ascendant sorted numeric array" should "be sorted for order (x < y)" in {
    Exercises.isSorted(Array(1, 2, 3, 5), (x: Int, y: Int) => x < y) shouldBe true
  }

  "A non-ordered numeric array" should "not be sorted for order (x < y)" in {
    Exercises.isSorted(Array(5, 4, 2, 7), (x: Int, y: Int) => x < y) shouldBe false
  }

  "A descendant sorted numeric array" should "not be sorted for order (x < y)" in {
    Exercises.isSorted(Array(5, 4, 3, 2, 1), (x: Int, y: Int) => x < y) shouldBe false
  }

  "A descendant sorted numeric array" should "be sorted for order (x > y)" in {
    Exercises.isSorted(Array(5, 4, 3, 2, 1), (x: Int, y: Int) => x > y) shouldBe true
  }

  "An ascendant sorted character array" should "be sorted for order (x < y)" in {
    Exercises.isSorted(Array('A', 'B', 'C'), (x: Char, y: Char) => x < y) shouldBe true
  }

}
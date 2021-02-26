package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


class DataStructuresSpec extends AnyFlatSpec with Matchers {
  "the tail Method" should "return the Tail of the Sequence" in {
    val someSequence = Seq(1, 2, 3, 4, 5, 7)
    Exercises.tail(someSequence) shouldBe someSequence.tail
  }

  "the tail Method" should "return the Tail of the List" in {
    val someList = List('a', 'b', 'c', 'd')
    Exercises.tail(someList) shouldBe someList.tail
  }

  "the tail Method" should "return Nil for an empty Sequence" in {
    Exercises.tail(Seq()) shouldBe Nil
  }

  "the tail Method" should "return Nil for an empty List" in {
    Exercises.tail(List()) shouldBe Nil
  }
}

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

  "setHead" should "change the head of a given List" in {
    val someList = List('a', 'b', 'c', 'd')
    Exercises.setHead('A', someList) shouldBe List('A', 'b', 'c', 'd')
  }

  "setHead" should "change the head of a given Seq" in {
    val someSequence = Seq(1, 2, 3, 4, 5, 7)
    Exercises.setHead('A', someSequence) shouldBe Seq('A', 2, 3, 4, 5, 7)
  }

  "drop" should "remove the given number of elements in a List" in {
    val someList = List('a', 'b', 'c', 'd')
    Exercises.drop(someList, 3) should===(List('d'))
  }

  "drop" should "not remove any elements if given number to remove is 0" in {
    val someList = List('a', 'b', 'c', 'd')
    Exercises.drop(someList, 0) should===(someList)
  }


  "drop" should "log an error if given number is less than 0" in {
    val someList = List('a', 'b', 'c', 'd')
    val thrown = intercept[RuntimeException] {
      Exercises.drop(someList, -1)
    }
    thrown.getMessage should===("number of element to drop must be positive")
  }

  "drop" should "return Nil when number of elements to drop is bigger than the List" in {
    val someList = List('a', 'b', 'c', 'd')
    Exercises.drop(someList, 10) shouldBe Nil
  }
}

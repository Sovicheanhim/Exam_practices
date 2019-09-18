import scala.collection.immutable.TreeSet
import scala.io.StdIn._

object INT02_EX13 {
  def main(args: Array[String]): Unit = {
    val tree_set = TreeSet(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Enter a number :")
    val number = readInt()
    println(s"The number in the set that is greater than or equal to $number is ${some(tree_set.minAfter(number))}")
  }
  def some(x:Option[Int]) = x match {
    case Some(s) => s
    case None => ""
  }
}

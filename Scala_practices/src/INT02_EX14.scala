import scala.io.StdIn._
object INT02_EX14 {
  def main(args: Array[String]): Unit = {
    println("Enter a number")
    var (number, sum) = (readInt(),0)
    for(i <- 1 to number )
      sum += (fibonacci(i)/i)
    println(sum)
  }
  def fibonacci(i: Int): Int = {
    var (product, count) = (1, i)
    while(count > 0){
      product *= count
      count -= 1
    }
    product
  }
}

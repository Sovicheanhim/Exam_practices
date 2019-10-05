object Curry_Functions {
  def sum(a:Int) = (b:Int) => a+b
  def main(args: Array[String]): Unit = {
    println(sum(10)(20))
    val sumValue = sum(10)
    println(sumValue(20))
  }
}

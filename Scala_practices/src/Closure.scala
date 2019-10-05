object Closure {
  def main(args: Array[String]): Unit = {
    val a = 10        //This is the free variable
    val sum = (_:Int) + a     // This is closure. Its return value depends on the free variable

    println(sum(10))
    println(sum(20))
    println(sum(23))
  }
}

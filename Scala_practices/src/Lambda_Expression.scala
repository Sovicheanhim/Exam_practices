object Lambda_Expression {
  def main(args: Array[String]): Unit = {
    val multiply = (x:Int, y:Int) => x*y
    val squareValue = (x:Int) => x*x
    val sum = (_:Int) + (_:Int)

    val list = List(1, 2, 3, 4, 5)
    println(s"${list.map(squareValue(_))}")
    println(s"The multiplication value of 6 and 5 is ${multiply(5, 6)}")
    println(s"Sum of 10 and 20 is ${sum(10, 20)}")
  }
}

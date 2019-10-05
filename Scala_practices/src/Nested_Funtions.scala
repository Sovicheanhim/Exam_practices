object Nested_Funtions {
  def main(args: Array[String]): Unit = {
    minAndMax(5, 7)
    multipleNestedFunction()
  }
  def minAndMax(a:Int, b:Int) = {
    def maxValue() = if(a>b) println("Max is " + a) else println("Max is " + b)
    def minValue() = if (a<b) println(s"Min value is $a") else println(s"Min value is $b")
    minValue()
    maxValue()
  }
  def multipleNestedFunction() = {
    secondMultipleNestedFunction()
    println("First Nested Function")
    def secondMultipleNestedFunction() = {
      thirdMultipleNestedFunction()
      println("Second Nested Function")
      def thirdMultipleNestedFunction() = {
        println("This is the Third Nested Functions")
      }
    }
  }
}

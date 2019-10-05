object Function_Composition {
  def main(args: Array[String]): Unit = {
    val add = (a:Int) => a+1
    val mul = (a:Int) => a*2
    val sub = (a:Int) => a-1
//    mul first and then add
    println((add compose mul)(2))
//    sub first and then mul and then add
    println((add compose mul compose sub)(2))

    //    add first and then mul
    println((add andThen mul)(2))
    //    sub first and then add and then mul
    println((add andThen  mul compose sub)(2))
  }
}

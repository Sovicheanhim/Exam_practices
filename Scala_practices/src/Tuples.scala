object Tuples {
  def main(args: Array[String]): Unit = {
    val names = ("Aang", "Katara", "Sokka")
    println(names.productIterator.foreach(i => println(i)))
    println(names._1, names._2, names._3)
  }
}

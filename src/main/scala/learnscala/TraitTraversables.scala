package learnscala

class TraitTraversables {
  def run(): Unit = {
    val a = Traversable[Int](1, 2, 3)
    val b = a.++(Traversable[Int](4, 5, 6))
    val c = b.map(_ + 1)
    val d = Traversable[String]("a b", "c d", "e f")
    val e = d.flatMap(_.split("\\s"))
    val f = e.collect { case i: String => i }
    val tuples = a.map(a => Tuple2(a, a + 1))
    val g = a.:\(1)((x, y) => {
      println(x)
      println(y)
      println("--------")
      x - y
    }
    )
    println(g)
  }
}

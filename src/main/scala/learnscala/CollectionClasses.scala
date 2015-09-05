package learnscala

import java.awt.Color

import scala.collection.immutable.HashMap
import scala.collection.{LinearSeq, SortedSet, mutable}

class CollectionClasses {
  def run(): Unit = {
    val a = Iterable(1, 2, 3)
    val b = Map(1 -> "a", 2 -> "b")
    val c = Set(Color.BLACK, Color.BLUE)
    val d = SortedSet("a", "c", "b")
    val e = mutable.Buffer("x", "y", "z")
    val f = IndexedSeq(2, 3, 4)
    val g = LinearSeq(1, 2, 3, 4, 5)
    val h = HashMap(1 -> "a", 2 -> "b")
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h.size)
  }
}

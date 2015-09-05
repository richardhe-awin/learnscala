package learnscala

class HigherOrder {
  def apply(f: Int => String, v: Int) = f(v)

  def d = new Decorator("[", "]")

  apply(d.layout, 7)
}

class Decorator(left: String, right: String) {
  def layout[A](x: A) = left + x.toString + right
}

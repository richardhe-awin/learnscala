package learnscala

class JavaToScala {
  def length[A](list: List[A]): Int = list match {
    case _ :: tail => println(tail); 1 + length(tail)
    case Nil => 0
  }

  def oncePerSecond(callback: () => Unit): Unit = {
    while (true) {
      callback()
      Thread sleep 1000
    }

  }

  def toYesOrNo(choice: Int): String = choice match {
    case 1 => "yes"
    case 0 => "no"
    case whatever => "error"
  }

  def f(x: Any): String = x match {
    case i: Int => "integer: " + i
    case j: Double => "a double" + j
    case s: String => "I want to say " + s
  }
}

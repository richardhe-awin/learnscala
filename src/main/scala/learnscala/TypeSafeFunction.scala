package learnscala

import java.io.BufferedReader

import scala.io.Source

class TypeSafeFunction {
  def print(file: String)(printer: (String) => BufferedReader): Unit = {
    println(printer(file).readLine())
  }

  def upper(input: String): String = {
    input.toUpperCase
  }

  def reader(file: String): BufferedReader = {
    Source.fromFile(file).bufferedReader()
  }
}

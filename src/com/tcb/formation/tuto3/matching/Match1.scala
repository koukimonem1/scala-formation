package com.tcb.formation.tuto3.matching

object Match1 {
  def main(args: Array[String]): Unit = {
    val numbers = 1 to 13
    numbers.foreach { f }
    println(getClassAsString(new Person))
  }
  def f(x: Int) {
    x match {
      case 1 => println("January")
      case 2 => println("February")
      case 3 => println("March")
      case 4 => println("April")
      case 5 => println("May")
      case 6 => println("June")
      case 7 => println("July")
      case 8 => println("August")
      case 9 => println("September")
      case 10 => println("October")
      case 11 => println("November")
      case 12 => println("December")
      case theDefaultValue => println("Unexpected case: " + theDefaultValue.toString) // assign a variable name to the default value and use on the right side
    }
  }

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown" // !!!! when using a wildcard, we cannot access the value of the default
  }
  class Person()
}
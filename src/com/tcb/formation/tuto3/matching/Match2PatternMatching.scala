package com.tcb.formation.tuto3.matching

import scala.Vector

object Match2PatternMatching {
  //You need to match one or more patterns in a match expression, and the pattern may be :
  // 1.a constant pattern,
  // 2.variable pattern,
  // 3.constructor pattern, 
  // 4.sequence pattern, 
  // 5.tuple pattern,
  // 6.or type pattern.
  def main(args: Array[String]): Unit = {
    // trigger the constant patterns
    println(f(0))
    println(f(true))
    println(f("hello"))
    println(f(Nil))
    // trigger the sequence patterns
    println(f(List(0, 1, 2)))
    println(f(List(1, 2)))
    println(f(List(1, 2, 3)))
    println(f(Vector(1, 2, 3)))
    // trigger the tuple patterns
    println(f((1, 2))) // two element tuple
    println(f((1, 2, 3))) // three element tuple
    // trigger the constructor patterns
    println(f(Person("Melissa", "Alexander")))
    println(f(Dog("Suka")))
    // trigger the typed patterns
    println(f("Hello, world"))
    println(f(42))
    println(f(42F))
    println(f(Array(1, 2, 3)))
    println(f(Array("coffee", "apple pie")))
    println(f(Dog("Fido")))
    // trigger the wildcard pattern
    println(f("33d"))
  }

  def f(x: Any): String = x match {
    // constant pattern
    case 0 => "zero"
    case true => "true"
    case "hello" => "you said 'hello'"
    case Nil => "an empty List"
    // sequence patterns
    case List(0, _, _) => "a three-element list with 0 as the first element"
    case List(1, _*) => "a list beginning with 1, having any number of elements"
    case Vector(1, _*) => "a vector starting with 1, having any number of elements"
    // tuples patterns
    case (a, b) => s"got $a and $b"
    case (a, b, c) => s"got $a, $b, and $c"
    // constructor patterns
    case Person(first, "Alexander") => s"found an Alexander, first name = $first"
    case Dog("Suka") => "found a dog named Suka"
    // typed patterns
    case s: String => s"you gave me this string: $s"
    case i: Int => s"thanks for the int: $i"
    case f: Float => s"thanks for the float: $f"
    case a: Array[Int] => s"an array of int: ${a.mkString(",")}"
    case as: Array[String] => s"an array of strings: ${as.mkString(",")}"
    case p: Person => s"person ${p.first}"
    case dog: Dog => s"dog ${dog.name}"
    // default value
    case _ => "Unknown"
  }
  case class Person(first: String, second: String)
  case class Dog(name: String)
}
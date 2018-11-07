package com.tcb.formation.tuto5.classes

object Class6LazyExample extends App {
  //define a field like this to be lazy , meaning it won’t be evaluated
  //until it is accessed.
  lazy val text = "aaaa"
  println(text)
}
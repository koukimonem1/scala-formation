package com.tcb.formation.tuto2.control.structer

object Struct1ForAndForeach {
  def main(args: Array[String]): Unit = {
    val a = Array("apple", "banana", "orange")
    for (e <- a) println(e)
    // to build a new collection from an input collection, use the term yield
    println("to build a new collection from an input collection, use the term yield")
    val newArray = for (e <- a) yield e.toUpperCase
    for (e <- newArray) println(e)
    //for with counters
    println("for with counters")
    for (i <- 0 until 10) println(i)
    // Generator: using for loop with Range
    println("Generator: using for loop with Range")
    for (i <- 1 to 10) println(i)
    //use guards ( if statements in for loops)
    println("use guards ( if statements in for loops)")
    for (i <- 1 to 10 if i < 5) println(i)
    val names = Map("fname" -> "Robert", "lname" -> "Goren")
    //Looping over a Map
    println("Looping over a Map")
    for ((k, v) <- names) println(s"key: $k, value: $v")
    // the scala compiler (scalac) translates :
    // 1. A simple for loop that iterates over a collection is translated to a foreach method
    //call on the collection.
    //2. A for loop with a guard (see Recipe 3.3) is translated to a sequence of a withFilter
    //method call on the collection followed by a foreach call.
    //3. A for loop with a yield expression is translated to a map method call on the col‐
    //lection.
    //4. A for loop with a yield expression and a guard is translated to a withFilter
    //method call on the collection, followed by a map method call.
  }
}
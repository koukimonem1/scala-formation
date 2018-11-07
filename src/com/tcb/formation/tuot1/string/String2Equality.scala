package com.tcb.formation.tuot1.string

object String2Equality {
  // In Scala, you test object equality with the == method. 
  //This is different than Java, where you use the equals method to compare two objects
  def main(args: Array[String]): Unit = {

    val s1 = "Hello"
    val s2 = "Hello"
    val testEquality = s1 == s2
    println(testEquality)
    // he == method is that it doesn’t throw a NullPointerException on a basic test if a String is null
    val testEquality2 = null == s1
    println(testEquality2)
    // == method defined in the AnyRef
  }
}
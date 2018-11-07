package com.tcb.formation.tuot1.string

object String1Methods {
  def main(args: Array[String]): Unit = {
    val s = "Hello, world"
    // methods that come from java.lang.String
    println(s.length)
    println(s + " kouki")
    /**
     *  strings have the access of the StringOps, WrappedString, StrinLike  etc... methods,
     *  but it begins with the implicit conversion from String to StringOps in the Predef object
     */
    // Predef:the `Predef` object provides definitions that are accessible in all Scala compilation units without explicit qualification.
    //Even though String is final, those methods are added through implicit conversions
    s.foreach { println }
    for (ss <- "kouki") println(ss)
    val ss = s.filter { _ != ',' }
    println(ss)
    println("scala".drop(2).capitalize.take(2))
  }
}
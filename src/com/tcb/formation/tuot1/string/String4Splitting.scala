package com.tcb.formation.tuot1.string

object String4Splitting {
  def main(args: Array[String]): Unit = {
    //  The split method is overloaded, with some versions of the method coming from the
    //Java String class and some coming from the Scala StringLike class.
    val s = "Hello world"
    // From java.lang.String
    s.split(" ") // return Array[java.lang.String]
    // From StringLike
    s.split(' ') // return Array[String]
  }
}
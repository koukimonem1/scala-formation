package com.tcb.formation.tuot1.string

object String3Multiline {
  def main(args: Array[String]): Unit = {
    val s = """ this is a 
multiline
    string :) """
    val s2 = """ this is a 
|multiline
    |string :) """.stripMargin
    println(s)
    println(s2)
  }

}
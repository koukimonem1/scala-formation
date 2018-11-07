package com.tcb.formation.tuto3.matching

object Match4Guards {
  def main(args: Array[String]): Unit = {
    val num = 3
    num match {
      case x if x == 1 => println("one, a lonely number")
      case x if (x == 2 || x == 3) => println(x)
      case _ => println("some other value")
    }
  }
}
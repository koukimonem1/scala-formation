package com.tcb.formation.tuto2.control.structer

object Struct2Yield {
  def main(args: Array[String]): Unit = {
    val names = Array("chris", "ed", "maurice")
    val capNames = for (e <- names) yield e.capitalize
    capNames.foreach { println }
    //If your algorithm requires multiple lines of code, perform the work in a block after the yield keyword:
    val lengths = for (e <- names) yield {
      // imagine that this required multiple lines of code
      e.length
    }
    lengths.foreach { println }
  }
}
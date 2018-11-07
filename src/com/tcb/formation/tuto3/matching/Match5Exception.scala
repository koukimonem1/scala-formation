package com.tcb.formation.tuto3.matching

import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.io.FileNotFoundException

object Match5Exception {
  def main(args: Array[String]): Unit = {
    var in = None: Option[FileInputStream]
    var out = None: Option[FileOutputStream]
    try {
      in = Some(new FileInputStream("/tmp/Test.class"))
      out = Some(new FileOutputStream("/tmp/Test.class.copy"))
    } catch {
      case e: FileNotFoundException => println("Couldn't find that file.")
      case e: IOException => e.printStackTrace
    } finally {
      println("entered finally ...")
      if (in.isDefined) in.get.close
      if (out.isDefined) out.get.close
    }
  }
}
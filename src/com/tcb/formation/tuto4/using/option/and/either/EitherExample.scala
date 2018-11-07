package com.tcb.formation.tuto4.using.option.and.either

import scala.Left
import scala.Right

object EitherExample {
  /**
   * one weakness of this approach is that the Option/Some/None approach doesn’t tell
   * you why something failed, that is, why you got a None instead of a Some
   */
  def main(args: Array[String]): Unit = {
    /**
     * Either ============> Option
     * Right  ============> Some
     * Left  ============> None, except you can include content with it to describe the problem
     */
    println(divideXByY(1, 0))
    println(divideXByY(35, 10))
  }
  def divideXByY(x: Int, y: Int): Either[String, Int] = if (y == 0) Left("Dude, can't divide by 0") else Right(x / y)
}
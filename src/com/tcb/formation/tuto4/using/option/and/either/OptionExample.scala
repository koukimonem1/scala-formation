package com.tcb.formation.tuto4.using.option.and.either

object OptionExample {
  def main(args: Array[String]): Unit = {
    /**
     *  your code could potentially throw a NullPointerException, so :
     * use the Option class when returning a value from a function that can be null.
     */

    println(toInt("1").get)
    println(toInt("aa").isEmpty) //Returns true if the option is None otherwise, false , true in this case
  }
  def toInt(in: String): Option[Int] = {
    try {
      Some(Integer.parseInt(in.trim)) // use Some if there is a value to be returned
    } catch {
      case e: NumberFormatException => None // use None if there is a value to be returned
    }
  }
}
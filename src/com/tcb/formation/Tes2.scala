package com.tcb.formation

object Tes2 {
  def main(args: Array[String]): Unit = {
    print(factorial(25))
  }
  def factorial(x: BigInt): BigInt = if (x == 0) 1 else x * factorial(x - 1)
}
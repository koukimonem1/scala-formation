package com.tcb.formation.tuot1.string

object String5Interpolation {
  def main(args: Array[String]): Unit = {
    // from scala 2.10
    val firstName = "kouki"
    val secondName = "monem"
    val age = 25
    println(s"my name is $firstName $secondName and I have $age")
    // expression
    println(s"my name is $firstName $secondName and I have ${age + 1}")
    println(s"test string iterpolation with expressions ${age == 30}")
    // !!!!! when using an object, we SHOULD use the curly braces 
    val student = new Student("abdou", 30)
    println(s"student name == $student.name")
    println(s"student name == ${student.name}")
    /**
     * Using 'f' interpolator
     */
    println(f"age = $age%.2f")
    println(f"age = $age%.1f")
    /**
     * The raw interpolator
     */
    // is used to avoid the \n
    println(s"$firstName \n $secondName")
    println(raw"$firstName \n $secondName")
  }
  class Student(var name: String, var age: Int)
}
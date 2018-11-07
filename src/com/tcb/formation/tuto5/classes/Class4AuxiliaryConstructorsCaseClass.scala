package com.tcb.formation.tuto5.classes

//adding what appears to be an auxiliary constructor to a
//case class is different than adding an auxiliary constructor to a “regular” class. This is
//because they’re not really constructors: they’re apply methods in the companion object
//of the class.
object Class4AuxiliaryConstructorsCaseClass extends App {
  val p = Person4("John Smith", 30) // behind the scenes, the Scala compiler converts it into this: val p = Person.apply("John Smith", 30)
  //To be clear, the word “constructor” is used loosely here.
  var p1 = Person4()
  val p2 = Person4("kouki")
  val p3 = Person4(25)
}

case class Person4(var name: String, var age: Int)

//if you decide that you want to add auxiliary constructors  the solution is to add apply methods to the companion object of the Person case class

object Person4 {

  def apply() { println(" default constructor"); new Person4("<no name>", 0) }
  def apply(name: String) { new Person4(name, 0) }
  def apply(age: Int) { new Person4("", age) }
}
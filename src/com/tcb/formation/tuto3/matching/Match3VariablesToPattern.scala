package com.tcb.formation.tuto3.matching

object Match3VariablesToPattern {
  def main(args: Array[String]): Unit = {
    var list1 = 1 :: 2 :: 12 :: Nil
    var list2 = 6 :: 2 :: 3 :: Nil
    var list3 = 9 :: 14 :: 1 :: Nil
    matchingList(list1)
    matchingList(list2)
    matchingList(list3)
    matchingList(Person("kouki", "monem"))
    matchingList(Person("kouki", "other"))
  }
  def matchingList(anyThing: Any): Unit = anyThing match {
    // !!! we can access the left side value with : case list: List[_]
    //but we cannot do this with the pattern : case list @ List(1, _*) so we have to use it like this
    case list @ List(1, _*) => println(s"list start with one value ${list(1)}")
    case list @ List(9, _*) => println(s"list start with 9 value ${list(1)}")
    case p @ Person(first, "monem") => println(s"person type, first name = ${p.firstName}, second name = ${p.secondName}")
    case other => println(s"other type")
  }
  case class Person(firstName: String, secondName: String)
}
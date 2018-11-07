package com.tcb.formation.tuto5.classes

class Class2Visibility {
  def main(args: Array[String]): Unit = {

    /****************/
    //    var person21 = new Person21("kouki", "monem")
    //    println(person21.firstName)
    //    person21.firstName = "reassigned value"
    //    println(person21.firstName)

    /****************/
    var person22 = new Person22("kouki", "monem")
    println(person22.firstName)
    // !!!!!!!!!!!! person22.firstName="reassigned value" : error : fields declared as val

    /****************/
    var person23 = new Person23("kouki", "monem")
    // println(person23.firstName)
    // person22.firstName="reassigned value"
    //the visibility of the field becomes very restricted, and Scala doesn’t generate accessor or mutator methods

    /****************/
    var person24 = new Person24("kouki", "monem")
    println(person22.firstName)
    // !!!!!!!!!!!! person22.firstName="reassigned value" : error : fields declared as val by defaut

    /****************/
    var person25 = new Person25("kouki", "monem")
    //    println(person24.firstName)
    //    person24.firstName = "reassigned value"
    //This keyword "private" prevents(interdict) getter and setter methods from being generated(we have to adding manually)
    var person26 = new Person26("kouki", "monem")
    // the same as the  last one
  }
}
//Scala generates both getter and setter methods for that field
class Person21(var firstName: String, var lastName: String)
//it should have an accessor(getter) method, and should not have a mutator(setter) method
class Person22(val firstName: String, val lastName: String)
// the visibility of the field becomes very restricted, and Scala doesn’t generate accessor or mutator methods
class Person23(firstName: String, lastName: String)
// Case class constructor parameters are val by default, you can still access the field, it differs from Person23
case class Person24(firstName: String, lastName: String)
//This keyword "private" prevents(interdict) getter and setter methods from being generated(we have to adding manually)
class Person25(private var firstName: String, private var lastName: String)
class Person26(private val firstName: String, private val lastName: String)

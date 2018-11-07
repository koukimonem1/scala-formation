package com.tcb.formation.tuto5.classes

object Class1PrimaryConstructor {
  def main(args: Array[String]): Unit = {
    //   Because the methods in the body of the class are part of the constructor, when an instance
    //of a Person class is created, you’ll see the output from the println statements at the
    //beginning and end of the class declaration, along with the call to the printHome and
    //printFullName methods near the bottom of the class
    val person = new Person1("kouki", "monem")
    person.firstName = "Scott"
    person.lastName = "Jones"
    println(person.firstName)
    println(person.lastName)

    // when the code is compiled, the mutator method is named name_$eq, eg : age_$eq(int age)
    //  p.name = "Ron Artest"
    //However, behind the scenes, Scala converts that line of code into this code:
    //p.name_$eq("Ron Artest")

    // the 'normal' mutator approach
    person.firstName = "Ron Artest"
    println(person.firstName)
    // the 'hidden' mutator method
    person.firstName_$eq("Metta World Peace")
    println(person.firstName)
    // there’s no reason to call the name_$eq method in the real world, but when you
    // get into overriding mutator methods, it’s helpful to understand how this translation process works.
  }
}
/************************************************************************************************************/

//• The constructor parameters
//• Methods that are called in the body of the class
//• Statements and expressions that are executed in the body of the class
/**
 * Because the fields are mutable(declared as var), Scala generates both accessor and mutator methods for them
 */
class Person1(var firstName: String, var lastName: String) {
  println("the constructor begins")
  // some class fields
  private val HOME = "la la la"
  /**
   * Because the age field is declared as a var , it’s also visible, and can be mutated and accessed
   */
  var age = 0
  /**
   * When the code is decompiled, the constructor parameters and class fields appear like this:
   * <code>
   * private String firstName;
   * private String lastName;
   * private final String HOME = System.getProperty("user.home");
   * private int age;
   * </code>
   * Anything defined within the body of the class other than method declarations
   * is a part of the primary class constructor. Because auxiliary
   * constructors must always call a previously defined constructor in the
   * same class, auxiliary constructors will also execute the same code.
   */
  // some methods
  override def toString = s"$firstName $lastName is $age years old"
  def printHome { println(s"HOME = $HOME") }
  def printFullName { println(this) } // uses toString
  printHome
  printFullName
  println("still in the constructor")

}

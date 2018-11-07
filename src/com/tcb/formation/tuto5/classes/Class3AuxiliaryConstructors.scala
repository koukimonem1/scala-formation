package com.tcb.formation.tuto5.classes

object Class3AuxiliaryConstructors extends App {
  val p1 = new Pizza(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  val p2 = new Pizza(Pizza.DEFAULT_CRUST_SIZE)
  val p3 = new Pizza(Pizza.DEFAULT_CRUST_TYPE)
  println(p3.crustType)
}

/**
 * Each auxiliary constructor must begin with a call to a previously defined constructor
 * Only the parameters in the primary constructors are considered as fields and their getters and setters are generated
 * ===> if you want the accessors and mutators to be generated for you, put them in the primary constructor
 */
class Pizza(var crustSize: Int, var crustType: String) {
  // one-arg auxiliary constructor
  def this(crustSize: Int) {
    this(crustSize, Pizza.DEFAULT_CRUST_TYPE)
  }
  // one-arg auxiliary constructor
  def this(crustType: String, crustSize: Int) {
    this(crustSize, crustType)
  }
  // zero-arg auxiliary constructor
  def this() {
    this(Pizza.DEFAULT_CRUST_SIZE, Pizza.DEFAULT_CRUST_TYPE)
  }
  //  In the example shown, all of the auxiliary constructors call the primary constructor, but
  //this isn’t necessary; an auxiliary constructor just needs to call one of the previously
  //defined constructors
  def this(crustType: String) {
    this(Pizza.DEFAULT_CRUST_SIZE)
    this.crustType = Pizza.DEFAULT_CRUST_TYPE
  }

  override def toString = s"A $crustSize inch pizza with a $crustType crust"

}
object Pizza {
  val DEFAULT_CRUST_SIZE = 12
  val DEFAULT_CRUST_TYPE = "THIN"
}
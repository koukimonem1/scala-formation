package com.tcb.formation.tuto5.classes

object Class5Private extends App {

}

class Stock {
  // getter and setter methods are generated
  var delayedPrice: Double = 9
  // keep this field hidden from other classes ==> no getter or setter are generated
  private var price: Double = _
  def setPrice(p: Double) { price = p }
  //Defining a field as private limits the field so it’s only available to instances of the same
  //class, in this case instances of the Stock class. To be clear, any instance of a Stock class
  //can access a private field of any other Stock instance.
  def isHigher(that: Stock): Boolean = this.price > that.price

  // a private[this] var is object-private, and can only be seen
  // by the current instance eg : 
  private[this] var price2: Double = _
  def setPrice2(p: Double) { price2 = p }

  // error: this method won't compile because price is now object-private
  /**
   * <code>
   * def isHigher2(that: Stock): Boolean = this.price2 > that.price2
   * </code>
   */
}
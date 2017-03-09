package typeclasses.sample

object Samples {

  /*
  this is a type class
  type class always stateless (it means that it work only wih passed params and don't save any state)
  */
  trait NumberLike[T] {
    def plus(a: T, b: T): T

    def divide(a: T, b: T): T

    def minus(a: T, b: T): T
  }

  object NumberLike {

    /*
     it's a singleton object
     'implicit' keyword plays important role here.
     All default implementations must be in companion object of type class
    */
    implicit object NumberLikeInt extends NumberLike[Int] {
      override def plus(a: Int, b: Int): Int = a + b

      override def divide(a: Int, b: Int): Int = a / b

      override def minus(a: Int, b: Int): Int = a - b
    }

  }

}

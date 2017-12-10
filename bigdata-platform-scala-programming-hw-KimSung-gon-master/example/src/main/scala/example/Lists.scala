package example


object Lists {
   def main(args: Array[String]) {
  /**
   * Write a function to get sum of a given list
   * Implement in a recursive way. Do not use any loop method.
   * For this example assignment you can use the following methods in class
   * `List`:
   *  - `xs.isEmpty: Boolean` returns `true` if the list `xs` is empty
   *  - `xs.head: Int` returns the head element of the list `xs`. If the list
   *    is empty an exception is thrown
   *  - `xs.tail: List[Int]` returns the tail of the list `xs`, i.e. the the
   *    list `xs` without its `head` element
   *
   * @param xs A list of natural numbers
   * @return The sum of all elements in `xs`
   */
  
  /**
   * Fill in a method that returns the maximum value of a list
   * You have to iterate through the List in a recursive way
   * You should not use any loop command
   * @param xs A list of natural numbers
   * @return The largest element in `xs`
   * @throws java.util.NoSuchElementException if `xs` is an empty list
   */
    val input = List(1,2,3)
    println("sum of input list is " + input.sum)
    println("maximum of input list is " + input.max)
    // define method here
  }

    def sum(xs: List[Int]): Int = if(!xs.isEmpty) xs.head + sum(xs.tail) else 0 
	
    def max(xs: List[Int]): Int = xs match {
	case List() => throw new java.util.NoSuchElementException
	case y::Nil => y
	case y::ys => if(y > max(ys)) y else max(ys)
    }
}

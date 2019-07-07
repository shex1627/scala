package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = {
      if (c == 0) 1
      else if (c == r) 1
      else {
        pascal(c-1, r-1) + pascal(c, r-1)
      }
    }
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {
      /* help function that stores the current side of the parenthesis, storing a normal char before hitting a parenthesis.*/
      def balance_check(curr_char: Char, chars: List[Char]): Boolean = {
        if (chars.isEmpty) {
          if (curr_char == '(') false else true
        } else {
          if (curr_char == '(') {

          } else if (curr_char == '(') {

          } else {

          }
        }
      }

    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }

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

  /** EASY
   * The numbers at the edge of the triangle are all 1, and each number inside the triangle is the sum of the two numbers above it. Write a function that computes the elements of Pascal’s triangle by means of a recursive process.
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
     Do this exercise by implementing the pascal function in Main.scala, which takes a column c and a row r, counting from 0 and returns the number at that spot in the triangle. For example, pascal(0,2)=1,pascal(1,2)=2 and pascal(1,3)=3.
   */
    def pascal(c: Int, r: Int): Int = if (c==r || c==0) 1 else pascal(c,r-1) + pascal(c-1,r-1)
  
  /** MEDIUM
   * Write a recursive function which verifies the balancing of parentheses in a string, which we represent as a List[Char] not a String. For example, the function should return true for the following strings:

(if (zero? x) max (/ 1 x))
I told him (that it’s not (yet) done). (But he wasn’t listening)
The function should return false for the following strings:

:-)
())(
The last example shows that it’s not enough to verify that a string contains the same number of opening and closing parentheses.

Do this exercise by implementing the balance function in Main.scala. Its signature is as follows:


    */
    def balance(chars: List[Char]): Boolean = {
      //por cada uno abierto debe haber uno cerrado. Mientras el balance sea cero estamos en true, si no, false
      def balanceAux(charRestantes: List[Char], cuenta: Int): Boolean ={
        if (charRestantes.length == 0) cuenta == 0
        else {
          if (charRestantes.head == '(') balanceAux(charRestantes.tail, cuenta + 1)
          else if (charRestantes.head == ')' && cuenta > 0) balanceAux(charRestantes.tail, cuenta - 1)
          else if (charRestantes.head == ')' && cuenta == 0) false
          else balanceAux(charRestantes.tail, cuenta)
        }
      }

      balanceAux(chars,0)
    }
  
  /** HARD
   * Write a recursive function that counts how many different ways you can make change for an amount, given a list of coin denominations. For example, there are 3 ways to give change for 4 if you have coins with denomination 1 and 2: 1+1+1+1, 1+1+2, 2+2.

     Do this exercise by implementing the countChange function inMain.scala. This function takes an amount to change, and a list of unique denominations for the coins. Its signature is as follows:

    Hint: Think of the degenerate cases. How many ways can you give change for 0 CHF(swiss money)? How many ways can you give change for >0 CHF, if you have no coins?

    */
    def countChange(money: Int, coins: List[Int]): Int = {

      def countChangeAux(moneyStill:Int, coinsLeft:List[Int], times:Int): Int = {

        if (moneyStill == 0) times
        else if (coinsLeft.isEmpty) times
        else 5
      }

      countChangeAux(money, coins, 0)
    }
  }


//Dynamic Programming
// polynomial complexity, much faster than backtracking, brute-force, etx...
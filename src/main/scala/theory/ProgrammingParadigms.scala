package theory

/**
  * Created by Usuario on 02/12/2018.
  */
object ProgrammingParadigms {

  /* paradigm : concepts or thought pattersn in scientific discipline
  // impreative
  // functionsl
  // logid
  / OO ortogonal to all of them, can be combined with all
  Imperative: modigy mutable variables using assingmenst and control structures, loops, break, continue, return
  Based in Von Newman...
  mutable vars --- memory cells,
  variable dereferences (getting the value stored in memory location pointed by pointer --- load instructions,
  variable assingmets--- store isntructions,
  control strunctures --- jumps
  problem: scaling up, avoid conceptualize programs word by word, need of High level abstractions such as collections,
  shapes, strings, documents, ideally by theories:
  theory -- one or more data types, operation on the types, laws describing the relationships....

  but there is no place for mutation, get new ways

  restricted FP ... no mutation at all... Pure Lisp, Haskel without I/O monad, Xpath, Scheme
  wider sense ... just concentrate in functions... Scala, Ruby, F#, Clojure, Lisp, Haskell

  Every non trivial programming lang:
    primitive expressions represent the simplest elements
    ways to combine expressions
    ways to abstract expressions, which introduce a name for an expression by which it can be referred to


    REPL Read Eval Print Loop
    sbt console

    Evaluation, take de leftmost operator, evaluate its operand (left before right), apply the operator to the operands
    name evaluated by replacing with right hand side of definition

   eval process stops once it results in a value (number, function,...
   )*/

  def loop: Int = loop
  def booleanLoop: Boolean = booleanLoop
  def abs(x:Double):Double = if (x<0) -x else x

  //we put all in the same block for cleanness
  //definitions inside a block are only visible from within the block
  // the definitions inside a block shadow definitions of the same name outside the block
  // value of the block is last expression, block is a list of expressions and a expression to be analyzed itself
  // podemos quitar todos los redundantes  x: Double, REUSING OUTPUT DEFINITIONS WITHOUT PASING THEN IN OUTPUT PARAMETERS
  def sqrt(x:Double): Double = {
    def improve(guess: Double, x: Double) = (guess + x / guess) / 2
    def isGoodEnough(guess: Double, x: Double)= abs(guess*guess -x)/x<0.001
    def sqrtIter(guess: Double, x:Double): Double = //return type not optional
      if (isGoodEnough(guess,x)) guess  else sqrtIter(improve(guess,x),x)
    sqrtIter(1.0,x)}
  //start with simate, ej y = 1
  // improve estimate by taking the mean of y and x/y  (al final x = y^2
// take small task and formulate as functio
  //isGoodEnough is not good for small and big numbers (test take absolute difference, the number can be smaller than 0,001 and with Big Numbers the mantisa can make the difference of big numbers to be more than 0.001 one from the next, so let´s normalize dividing by x



  //With Newton method
  // start stimate y = 1, repeatedly take the mean of y and x/y

  def constOne(x:Int,  y: => Int) = 1
  def and(x: Boolean ,y: => Boolean): Boolean = if (x) y else true
  def main(args: Array[String]): Unit = {
  lazy val infinito = loop
    println(constOne(1,loop))
    println(and(false, booleanLoop))
    println(sqrt(2))
    println(sqrt(1e-6))
    println(sqrt(1e60))
  }

}

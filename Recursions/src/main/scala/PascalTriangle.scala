/**
  * Created by nandakishore on 6/20/2016.
  */
import scala.io.StdIn.{readInt}

object PascalTriangle {

  def main(args: Array[String]) {

    println("Pascals Traingle")
    println("Enter the number of rows you need!!!")
    var n: Int = readInt()
    if(n <= 0) {
      println("Please enter number greater than zero")
      n = readInt()
    }

    if( n>0 ) {
      //Print pascal triangle
      for (row <- 0 to n) {
        for (col <- 0 to row)
          print(pascal(col, row) + " ")
        println()
      }
    }
  }

  //pascal Method calling itself recursively
  def pascal(c: Int, r: Int): Int = {

    if(c==0 || r == c) 1
    else pascal(c,r-1) + pascal(c-1,r-1)

  }

}

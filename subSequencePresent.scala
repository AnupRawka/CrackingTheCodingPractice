package main.scala

object subsequencePresent {


  def main(args: Array[String]): Unit = {
println(checkSubsequence("defg","ABCdefGHgI"))
  }

  def checkSubsequence(str1: String, bigStr: String): Boolean ={
var i =0
    var j=0
    for (i <- 0 to bigStr.length-1){
      if (j==str1.length) true
      else {
        if (str1(j) == bigStr(i)) {
          j += 1
        }
      }
    }
    j==str1.length
  }

}

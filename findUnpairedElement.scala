package main.scala

object findUnpairedElment {
  def main(args: Array[String]): Unit = {
println(findUnpairedElement(Array(0,1,2,3,1,2,3,4,5,5,7,6,7,6)))
  }
  def findUnpairedElement(arr: Array[Int]) : Int={
    var result = arr(0)
    for (i <- 1 to arr.length-1)
      {
       result=result ^ arr(i) //the property of xor operation returns 0 when paired with same Integer. (It works only for integer)
      }
    result
  }
}

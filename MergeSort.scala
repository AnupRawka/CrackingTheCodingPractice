package main.scala

import scala.collection.mutable.ArrayBuffer

object MergeSort {

  def main(args: Array[String]): Unit = {
    var arr= new ArrayBuffer[Int]()
    arr+=(1)
    println(mergeSort(Array(1,23,43,54,64,67,7,3,5,78,99,6656,0).toList))
  }

def mergeSort(nums: List[Int]): List[Int] ={
  var n = nums.length/2
  if (n==0) nums
  else
  {
    def merge(xs: List[Int], ys: List[Int]): List[Int] ={
      (xs,ys) match {
        case (Nil, xs) => xs
        case (ys, Nil) => ys
        case (x:: xs1,y :: ys1 ) =>
          if (x < y) x::merge(xs1, ys)
          else y::merge (xs, ys1)
      }

    }
    val (left, right)= nums.splitAt(n)
    merge(mergeSort(left),mergeSort(right))
  }

}

}

package main.scala

object findMedianUnsortedArray {

  def main(args: Array[String]): Unit = {
println(findMedian(Array(0,9,6,5,8,3,2,7,4,1),8,10))
  }
  var discard=0
  def findMedian(arr: Array[Int],mEle:Int, arrLength:Int ): Int= {
    if (arr.length==1) return arr(0)
    val pivot = arr(arr.length / 2)
    var filArr = arr.filter(_ < pivot)
    var len = filArr.length
    if (len >= mEle - discard) {
      discard = arrLength - len
      findMedian(filArr, mEle, arrLength)
    }
    else {
      discard =len
      findMedian(arr.filter(_>pivot),mEle,arrLength)
    }
    }
}

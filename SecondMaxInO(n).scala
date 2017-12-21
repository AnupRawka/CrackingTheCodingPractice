  object Solution {
  def findSecMax(arr: Array[Int]) : Int= {
    var dummyMax = arr(0)
    var dummySecMax = arr(1)
    if (arr(0) <= arr(1)) {
      dummyMax = arr(1)
      dummySecMax = arr(0)
    }
  for ( i <- 2 to (arr.length-1)){
    arr(i) match {
      case greater if (greater > dummyMax) =>
      dummySecMax = dummyMax
      dummyMax= arr(i)
    case between if (between>= dummySecMax && arr(i) <= dummyMax) =>dummySecMax==arr(i)
    case _ => println(s"${arr(i)}  is smaller than both max: $dummyMax and sec max: $dummySecMax")
  }
}
    dummySecMax
  }
  
  def main(args: Array[String]): Unit = {
      println(findSecMax(Array(21,11,15,5,6,7,78,65,90)))
  }
  }

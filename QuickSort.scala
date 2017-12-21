object Solution {
def main(args: Array[String]): Unit = {
println(quickSort(Array(4,21,65,423,7785,32,5,54,68,8,967,654,64356,90,98)).mkString(","))
}
  def quickSort(arr: Array[Int]): Array[Int]={

    if (arr.length<2) arr
    else {
      val pivot = arr(arr.length/2)
      Array.concat(
        quickSort(arr.filter( pivot <)),
        arr.filter(pivot ==),
        quickSort(arr.filter(pivot >))
      )
    }
  }
  }

// To execute Scala code, please define an object named Solution that extends App

object Solution extends App {
  
  def  getMap(str: String): scala.collection.mutable.Map[Char, Int]={
    var map=scala.collection.mutable.Map[Char, Int]()
    str.toLowerCase.toCharArray.foreach{ch =>
      map.get(ch) match{
        case None => map.put(ch,1)
        case Some(x) => map.put(ch, x+1)
      }
    }
    map
  }
  
  def compareMap(map1: scala.collection.mutable.Map[Char, Int], map2: scala.collection.mutable.Map[Char, Int]): Boolean={
    val keySet=map2.keySet
    map1.keySet.foreach{
      key =>
  map2.get(key) match {
  case None => return false
  case Some(x) => if (x != map1.get(key).get) return false
  }
    }
    true
  }
  
  
  def isAnagram(str1: String, str2 : String) :Boolean={
    compareMap(getMap(str1),getMap(str2))
  }
  
  val testStr="pool"
  val testList=Array("loop","dump","polo","lolo")
  testList.foreach{str =>
  if (!isAnagram(testStr,str)) println(s"Not anagrams $testStr   and   $str")
  }
}

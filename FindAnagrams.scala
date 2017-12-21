object Solution {

 def main(args: Array[String]): Unit = {
  println(findAnagrams("Loop", List("Pool","oolp","oolpo","lopo","polo")).mkString(" , "))
 }

def getStrMap(str: String): mutable.Map[Char, Int]= {
  val map = mutable.HashMap[Char, Int]()
  str.toCharArray.foreach { ch =>
    map.get(ch) match {
      case None => map.put(ch, 1)
      case _ => map.put(ch, map.get(ch).get + 1)
    }
  }
  map
}

  def compareMap(chMap1: mutable.Map[Char, Int], chMap2: mutable.Map[Char, Int]): Boolean={
    chMap1.keySet.foreach{
      ch => if (chMap1.get(ch).get != chMap2.get(ch).get) return false
    }
    true
  }
  def findAnagrams(str: String, testList: List[String]): ListBuffer[String] ={
    val list =  new ListBuffer[String]()
    testList.foreach{st=>
        if (st.length ==str.length){
          if (compareMap(getStrMap(str.toLowerCase), getStrMap(st.toLowerCase))) list+=st
        }
else println(s"${st} and $str does not have same length")
      }
    list
    }
    }


  case class Node(var data: Int,
      var left : Option[Node],
       var right :Option[Node]
)


object Solution {
  var lLen=0
  var rLen=0
  val tree = Node( (10),
    Some(Node(5,
      Some(Node(2,
        Some(Node(12, None, None)),
        None)),
      Some(Node(1, None, None)))),
    Some(Node(4,
      Some(Node(9, None, None)),
      Some(Node(3, None, None)))))

  def main(args: Array[String]): Unit = {
    println(s"Height of tree - ${heightOfTree(tree)}")
    println(s"Number of nodes in tree - ${lLen +1}")

  }

def heightOfTree(node: Node) : Int={

  def loop (nd: Option[Node]): Int = nd match {
    case None => 0

    case Some(nd) =>
      lLen+=1
      Seq (loop(nd.right),loop(nd.left)).max +1
    case _ => 0
  }

  loop(Option(node))
}
}


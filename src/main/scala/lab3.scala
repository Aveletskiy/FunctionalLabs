package main.scala

object lab3 {
  object binaryTreeOps{
    def printTree(tree: Tree, space: String = "|"): Unit = {
      if (tree != null) {
        printTree(tree.getRightSubtree, space + "-")
        println(space + tree.getNodeData)
        printTree(tree.getLeftSubtree, space + "-")
      }
    }

    def insert(nodeData: Int, tree: Tree): Tree =  {
      if (tree == null) Leaf(nodeData)
      else
      if (nodeData <= tree.getNodeData)
        Node(insert(nodeData, tree.getLeftSubtree), tree.getRightSubtree, tree.getNodeData)
      else
        Node(tree.getLeftSubtree, insert(nodeData, tree.getRightSubtree), tree.getNodeData)
    }

    def contains(nodeDate: Int, tree: Tree): Boolean = {
      if (tree == null) false
      else
      if (nodeDate == tree.getNodeData) true
      else
      if (nodeDate < tree.getNodeData) contains(nodeDate, tree.getLeftSubtree)
      else contains(nodeDate, tree.getRightSubtree)
    }

    def sum(tree: Tree): Int = {
      if (tree == null) 0
      else sum(tree.getLeftSubtree)+sum(tree.getRightSubtree)+tree.getNodeData
    }
  }

  def main(args: Array[String]): Unit = {
    val r = scala.util.Random
    var tree: Tree = Leaf(50)

    for(a <- 1 to 14){tree = binaryTreeOps.insert(r.nextInt(100), tree)}
    binaryTreeOps.printTree(tree)

    Array(50,23).foreach( x => {
      if(binaryTreeOps.contains(x, tree)){println(s"* ${x} присутвует в дереве")}
      else{println(s"* ${x} не присутвует в дереве")}
    })

    println(s"Сумма элемента дерева ${binaryTreeOps.sum(tree)}")
  }
}

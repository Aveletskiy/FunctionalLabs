package main.scala

object lab3 {
  def main(args: Array[String]): Unit = {

    def printTree(tree: Tree): Unit = {
      if(tree != null)
        printTree(tree.getLeftSubtree)
        println(tree.getNodeData)
        printTree(tree.getRightSubtree)
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


}

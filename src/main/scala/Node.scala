package main.scala

class Node extends Tree{
  private var _left: Tree = null
  private var _right: Tree = null
  private var _data: Int = 0

  def getLeftSubtree: Tree = _left
  def getRightSubtree: Tree = _right
  def getNodeData: Int = _data

  def this(nodeData: Int){
    this
    this._data = nodeData
  }

  def this(leftSubTree: Tree, rightSubTree: Tree, nodeData: Int){
    this(nodeData)
    this._left = leftSubTree
    this._right = rightSubTree
  }
}

object Node{
  def apply: Node = new Node()
  def apply(nodeData: Int): Node = new Node(nodeData)
  def apply(leftSubTree: Tree, rightSubTree: Tree, nodeData: Int): Node = new Node(leftSubTree, rightSubTree, nodeData)
}


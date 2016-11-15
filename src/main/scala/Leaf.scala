package main.scala

class Leaf extends Tree{
  private var _data: Int = 0
  def this(nodeData: Int){
    this
    this._data = nodeData
  }

  def getLeftSubtree: Tree = null
  def getRightSubtree: Tree = null
  def getNodeData: Int = _data
}

object Leaf {
  def apply: Leaf = new Leaf()
  def apply(leafData: Int): Leaf = new Leaf(leafData)
}
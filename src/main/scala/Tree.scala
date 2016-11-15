package main.scala

trait Tree {
  def getLeftSubtree: Tree
  def getRightSubtree: Tree
  def getNodeData: Int
}

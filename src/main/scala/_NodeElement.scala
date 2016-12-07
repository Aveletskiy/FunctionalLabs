package main.scala

/**
  * Created by ixusv on 07.12.2016.
  */
abstract class NodeElement
case class Operator(data: Int) extends NodeElement
case class Operand(data: Char) extends NodeElement

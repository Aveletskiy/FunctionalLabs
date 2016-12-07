package main.scala

/**
  * Created by ixusv on 07.12.2016.
  */
abstract class Pair
case class NullElement(dataI: Int, dataII: Int) extends Pair
case class Element(dataI: Int, dataII: Int) extends Pair

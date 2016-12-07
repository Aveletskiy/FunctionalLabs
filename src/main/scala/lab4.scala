//package main.scala
//
//object lab4 {
//
//  /*3.1*/
//
//  def printElement(el: NodeElement): Any ={
//    el match {
//      case Operator(x)=> x match{
//        case 1 => '+'
//        case 2 => '-'
//        case 3 => '*'
//        case 4 => '/'
//      }
//      case Operand(param) => param
//    }
//  }
//
//  def printTree(tree: _Tree, lvl: Int): Unit ={
//    tree match {
//      case _Node(data, left, right) =>
//        printTree(left, lvl+1)
//        println(" " * lvl + printElement(data) )
//        printTree(right, lvl+1)
//
//      case _Leaf(data) => println(" " * lvl + printElement(data))
//    }
//  }
//
//  def printTreeElement(tree: _Tree): Unit ={
//    tree match {
//      case _Node(data, left, right) =>
//        printTreeElement(left)
//        printTreeElement(right)
//        print(printElement(data))
//      case _Leaf(data) => print(printElement(data))
//    }
//  }
//
//  def listDivisionWithCase(lst: List[(Pair)]): List[Option[Double]] ={
//    lst match {
//      case Nil => Nil
//      case _ =>
//        val res = lst.head match {
//          case Element(dF, dS) => Some(dF*1.0/dS)
//          case NullElement(dF, dS) => None
//        }
//        res :: listDivisionWithCase(lst.tail)
//    }
//  }
//
//  def listDivision(lst: List[(Int, Int)]): List[Option[Double]] ={
//    lst match {
//      case Nil => Nil
//      case _ =>
//        val res = lst.head match {
//          case Element(dF, dS) => Some(dF*1.0/dS)
//          case NullElement(dF, dS) => None
//        }
//        res :: listDivision(lst.tail)
//    }
//  }
//
//  def printDivision(lst: List[Option[Double]]): List[String] ={
//    lst match {
//      case Nil => Nil
//      case _ =>
//        val res = lst.head match {
//          case Some(double) => "Рез-т деления = "+double
//          case None => "Вывести результат деления не возможно"
//        }
//        res :: printDivision(lst.tail)
//    }
//  }
//
//  def main(args: Array[String]): Unit = {
//    val list = List((1,2),(2,3),(1,0))
//    println(printDivision(listDivision(list)))
//    val pairList: List[Pair] = List(Element(1,2), Element(2,3), NullElement(1,0))
//    println(printDivision(listDivisionWithCase(pairList)))
//    println("\n---------------\n")
//
////    abstract class _Tree
////    case class _Leaf(data: NodeElement) extends _Tree
////    case class _Node(data: NodeElement, leaf: _Tree, right: _Tree)
//
////    abstract class NodeElement
////    case class Operator(data: Int) extends NodeElement
////    case class Operand(data: Char) extends NodeElement
//
//    val tree = _Node(
//      Operator(1),
//        _Leaf(
//          Operand('a')
//        ),
//        _Leaf(
//          Operand('b')
//        )
//    )
//
//
//    //printTree(tree,1)
//    //printElement(tree)
//
//
//  }
//  /*3.2*/
//  /*3.3*/
//  /*3.4*/
//}

package main.scala
import scala.io.StdIn.{readInt}

object lab1 {
  def main(args: Array[String]): Unit = {

    def tailFunc (lst: List[Int]): List[Int]={
      def tailRecursiveSum(lst: List[Int], accumList: List[Int]): List[Int]={
        if (lst == Nil)
           return accumList
        if(accumList == Nil)
           return tailRecursiveSum(lst.tail, List(lst.head))

        return tailRecursiveSum(lst.tail, accumList ::: List(lst.head + accumList.last))
      }
       tailRecursiveSum(lst, Nil)
    }

    def noTailFunc(lst: List[Int]): List[Int] = {
      def recursiveSum(list: List[Int], sum: Int): List[Int] = {
        if (list.isEmpty)
          return Nil
        else
          return list.head + sum :: recursiveSum(list.tail, list.head + sum)
      }
      recursiveSum(lst,0)
    }

      print(">>")
      val range = readInt()
      val list = List.range(1, range)
      println(list)
      println(tailFunc(list))
      println(noTailFunc(list))
  }
}

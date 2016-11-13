package main.scala
import scala.io.Source

object readfile {

  def main(args: Array[String]): Unit ={
    def getSourceFile(): Unit ={
      val home = System.getProperty("user.home")
      val source = Source.fromFile(s"${home}/tsv/table.csv")

      type Student = (Int,String,Int,String,Char,Int,Boolean)

      try{
        for(line <- source.getLines()) {
          val Array(month, revenue, expenses, profit) = line.split(",").map(_.trim)
        }
      }
      finally source.close()
    }
    getSourceFile()
  }
}

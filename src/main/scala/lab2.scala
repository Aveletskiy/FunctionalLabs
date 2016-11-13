package main.scala

object lab2 {

  def main(args: Array[String]): Unit = {
    type Student = (Int, String, Int, String, Char, Int, Boolean)
    type Room = (Int, Int, List[Int])
    type Neighbors =(Int, List[Student])

    val student: List[Student] = List(
      (0, "Алёна", 1995, "FIL", 'F', 1, true),
      (1, "Гриша", 1994, "AVT", 'M', 2, true),
      (2, "Настя", 1993, "MTS", 'F', 3, false),
      (3, "Коля", 1997, "MTS", 'M', 1, false),
      (4, "Миша", 1997, "AVT", 'M', 3, true),
      (5, "Оля", 1992, "FIL", 'F', 3, false),
      (6, "Маша", 1991, "AVT", 'F', 5, true),
      (7, "Таня", 1993, "FIL", 'M', 4, true),
      (8, "Женя", 1992, "FIL", 'F', 4, true),
      (9, "Света", 1989, "AVT", 'F', 3, true),
      (10, "Аня", 1996, "MTS", 'F', 4, false),
      (11, "Лена", 1996, "AVT", 'F', 2, true),
      (12, "Сергей", 1994, "FIL", 'M', 3, false),
      (13, "Влад", 1993, "FIL", 'M', 5, false),
      (14, "Гена", 1996, "MTS", 'M', 1, true),
      (15, "Дима", 1995, "AVT", 'M', 5, false),
      (16, "Катя", 1991, "FIL", 'F', 4, false),
      (17, "Артём", 1994, "MTS", 'M', 3, true),
      (18, "Диана", 1995, "FIL", 'M', 4, false)
    )

    val rooms: List[Room] = List(
      (37, 3, List(0 , 7, 8)),
      (42, 2, List(1, 4)),
      (43, 3, List(6, 9, 11)),
      (54, 2, List(14, 17))
    )

    /*3.1*/
    def processList(lst: List[Int], func: (Int) => Int): List[Int] = {
      def recurentProcess(_list: List[Int], _func: (Int)=>Int, accumul: List[Int]): List[Int]={
        if (_list == Nil) accumul
        else recurentProcess(_list.tail, _func, _func(_list.head)::accumul)
      }
      recurentProcess(lst, func, Nil).reverse
    }

    /*3.2*/
    def convertToStringList(lst: List[Int]): List[String] = {
      lst.foreach( element => println(s"Элемент под номером ${lst.indexOf(element)}" +
        s" равен ${element}"))
      lst.map(_.toString)
    }

    /*3.3*/
    def getByDepartment(students: List[Student], department: String): List[Student]={
      students.filter(stud => stud._4 == department)
    }

    def getOlderThen(year: Int, list: List[Student]): Unit ={
      getByDepartment(list, "FIL")
        .filter(stud => stud._3 < year)
        .foreach(stud => println(s"${stud._2} студент(ка) ${stud._6} курса, старше ${year} года"))
    }
    getOlderThen(1993, student)

    def getNeighbors(rooms: List[Room], student: List[Student]): List[Neighbors] ={
        rooms
            .map(room => (
              room._1,
              getByDepartment(student, "FIL")
                .filter(stud => room._3.contains(stud._1))
              ))
            .filter(t => t._2 != List())
    }
    println(s"В комнате ${getNeighbors(rooms, student).head._1} " +
      s"проживают ${getNeighbors(rooms, student).head._2.map(_._2).mkString(" ")}")
  }
}

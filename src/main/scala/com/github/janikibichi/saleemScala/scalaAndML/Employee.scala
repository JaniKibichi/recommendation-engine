package com.github.janikibichi.saleemScala.scalaAndML

import scala.util.Random

object Employee{
  case class EmployeeGuy(name: String, age: Int)

  def main(args: Array[String]){
    val NUM_EMPLOYEES = 5

    val firstNames = List("Bruce","Great","The","Jackie")
    val lastNames = List("Lee","Khali","Rock","Chan")

    val employees = (0 until NUM_EMPLOYEES) map { i =>
      //Get Random First and Last Names
      val first = Random.shuffle(firstNames).head
      val last = Random.shuffle(lastNames).head

      //Arrange the fullname
      val fullName = s"$last, $first"

      //Get a random age above 20
      val age = 20 + Random.nextInt(40)

      //Create the employee instance
      EmployeeGuy(fullName, age)
    }

    employees foreach println

    val hasLee = """(Lee).*""".r

    for(employee <- employees){
      employee match{
        case EmployeeGuy(hasLee(x), age) => println("Found a Lee!")
        case _ => //Do Nothing
      }
    }
  }
}

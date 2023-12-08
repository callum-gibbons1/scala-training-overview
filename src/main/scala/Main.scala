import Variables._
import Flow._
import Match._
import Monads._

object Main{
	def main(args: Array[String]): Unit = {
		println("Hello World!")

		println("variable1: "+variable1)
		println("variable2: "+variable2)
		variable2 = "new value"
		println("variable2 after change: "+variable2)
		Thread.sleep(1000)
		println("variable3: "+variable3)
		println("variable4: "+variable4)
		Thread.sleep(1000)
		println("variable4 again: "+variable4)
		println("function: "+func("Daisy"))

		//-----------------------------------------
		println("Square a number: "+squareNum(6))

		//-----------------------------------------
		println(identifyAnimal(Dog))
//		println(identifyAnimal(Rabbit))

		println(getFirstName(Person("Helen", "Brooks")))

		//-----------------------------------------
		println("Option with value: "+dealingWithNulls(Some("Hi")))
		println("None Option: "+dealingWithNulls(Some("None")))

		println("addOneToNumbers: "+addOneToNumbers(List(1, 2, 3)))

		println("Add 1 to a Some: "+addOneToOptionalNum(Some(42)))
		println("Add 1 to a Some: "+addOneToOptionalNum(None))

		println("Print 10 times... ")
		printNumOfTimes(10)

	}
}

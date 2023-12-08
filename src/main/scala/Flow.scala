object Flow {

	//Using return
	def squareNum(num: Int) = {
		/*
		* return num*num
		 */

		num*num
	}

	//Loops
	def printNumOfTimes(x: Int) = {
		(1 to x).map(i => println("number - "+i))
	}

}

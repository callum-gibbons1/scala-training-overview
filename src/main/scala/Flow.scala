object Flow {

	//Using return
	def squareNum(num: Int): Int = {
		/*
		* return num*num
		 */
		val sq: Int = num*num
		sq
	}

	//Loops
	def printNumOfTimes(x: Int) = {
		(1 to x).map(i => println("number - "+i))
	}

	//while(true) loop
	def func(i: Int): Int = {
		println(i)
		func(i+1)
	}

}

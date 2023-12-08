object Monads {

	def dealingWithNulls(mightBeNull: Option[String]) = {
		/*
	  * val mightBeNull = ...
	  * if(mightBeNull == null) do something else do something else
		 */

		mightBeNull match {
			case Some(value) => "The value is "+value
			case None => "mightBeNull is empty"
		}
	}

	def addOneToNumbers(nums: List[Int]) = {
		nums.map(num => num + 1)
	}

	def addOneToOptionalNum(optionalNum: Option[Int]) = {
		val newValue = optionalNum.map(num => num + 1)

		println(optionalNum)
		println(newValue)

		newValue
	}

}

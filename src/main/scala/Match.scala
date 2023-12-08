object Match {

	sealed trait Animal
	final object Dog extends Animal
	final object Cat extends Animal
	final object Rabbit extends Animal

	def identifyAnimal(animal: Animal): String = {
		//if(animal.isInstanceOf[Dog]) print("It's a Dog!")...
		animal match {
			case Cat => "It's a Cat!"
			case Dog => "It's a Dog!"
		}
	}

	case class Person(firstName: String, lastName: String)

	def getFirstName(person: Person) = {
		person match {
			case Person(firstName, _) => println("It's "+firstName)
		}
	}


}

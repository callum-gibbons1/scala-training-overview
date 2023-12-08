import java.time.Instant

object Variables {

	val variable1 = "Hello "+Instant.now()
	//Not immutable, not good in Scala
	var variable2 = "Hello "+Instant.now()
	lazy val variable3 = "Hello "+Instant.now()
	def variable4 = "Hello "+Instant.now()
	def func(name: String) = "Hello "+name
}

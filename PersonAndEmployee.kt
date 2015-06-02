package com.tutsplus.code.tutorial.kotlin4

open class Person(var name: String, var age: Int, var college: String?) {
    
    var email: String = ""

	constructor(name:String, age:Int, college: String?, email: String) : this(name, age, college) {
        this.email = email
	}

	open fun isEligibleToVote(): Boolean {
		// If age is greater or equal to 18
		// return true

		return age >= 18
	}

	fun isOctogenarian(): Boolean = age in 80 .. 89
}

class Employee(name: String, age: Int, college: String?, var company: String) : Person(name, age, college) {
    override fun isEligibleToVote(): Boolean {
		// Always return true
		return true
	}
}

fun Person.isTeenager(): Boolean {

	// If age falls in the range
	// 13-19 return true

	return age in 13..19
}

fun main(args: Array<String>){
	var jake = Person("Jake Hill", 24, "Stephen's College", "jake.hill@example.com")
	println(jake.isTeenager())	
	println(jake.isOctogenarian())
	println(jake.isEligibleToVote())

	var jill = Employee("Jill Stone", 17, "Northern College", "Example Corporation")
	println(jill.isTeenager())	
	println(jill.isOctogenarian())
	println(jill.isEligibleToVote())
}


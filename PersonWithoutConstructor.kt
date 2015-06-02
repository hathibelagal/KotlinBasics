package com.tutsplus.code.tutorial.kotlin2

class Person {
	var name: String = ""
	var age: Int = 0
	var college: String? = null
}

fun main(args: Array<String>){
	var jake = Person()
	jake.name = "Jake Hill"
	jake.age = 24
	jake.college = "Stephen's College"
}

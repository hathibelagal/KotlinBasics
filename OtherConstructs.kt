package com.tutsplus.code.tutorial.kotlin7

fun main(args: Array<String>){

	// if expression
	var age = 20
	val isEligibleToVote = if(age > 18) "Yes" else "No"

	println(isEligibleToVote)

	// when expression
	val typeOfPerson = when(age){
		 0 -> "New born"
		 in 1..12 -> "Child"
		 in 13..19 -> "Teenager"
		 else -> "Adult"
	}

	println(typeOfPerson)

	// for..in loop
	val names = arrayOf("Jake", "Jill", "Ashley", "Bill")

	for (name in names) {
		println(name)
	}

	for (i in 0..9) {
		println(i)
	}

	// while loop
	var i = names.size()
	while(i>0) {
		println(names[--i])
	}
	
}

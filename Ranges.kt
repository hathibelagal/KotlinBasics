package com.tutsplus.code.tutorial.kotlin6

fun main(args: Array<String>){

	val r1 = 1..5
	val r2 = 5 downTo 1
	val r3 = 5 downTo 1 step 2

	for(i in r1) {
		println(i)
	}

	println("---")

	for(i in r2) {
		println(i)
	}

	println("---")

	for(i in r3) {
		println(i)
	}
}

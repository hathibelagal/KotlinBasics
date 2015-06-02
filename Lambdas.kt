package com.tutsplus.code.tutorial.kotlin5

fun doubleTheResult(x:Int, y:Int, f:(Int, Int)->Int): Int {
	return f(x,y) * 2
}

fun main(args: Array<String>){
	val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
	val actualSum = sumLambda(3,4)

	println(actualSum)

	val result1 = doubleTheResult(3, 4, sumLambda)
	val result2 = doubleTheResult(3, 4, {x,y -> x+y})

	println(result1)
	println(result2)

	val numbers:Array<Int> = arrayOf(1, 2, 3, 4, 5)
	val squaredNumbers = numbers.map({x -> x * x})

	for(i in squaredNumbers) {
		println(i)
	}
}

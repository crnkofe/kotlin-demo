package org.main

class DemoKt {

	fun fibo(x: Int): Int {
		assert(x >= 1)
		if ((x == 1) or (x == 2)) {
			return 1
		} else {
			return fibo(x-1) + fibo(x-2)
		}
	}

	fun foo(bar : String = "optional") : Unit {
		val x = 1
		val y = true
		val z = "test"

		for (x in listOf("$x", "$y", "$z", bar)) {
			println(x)
		}
	}

	fun max(vararg numbers : Int): Int {
		val result = ArrayList<Int>()
 	    for (t in numbers) result.add(t)
			
		return result.reduce { acc, it -> if (acc > it) acc else it }
	}

	fun bam(n : Int) : Int {
		var t : String = ""
		for (i in 1..n) {
			t = "$t $i"
		}

		for (i in n downTo 1) {
			t = "$t $i"
		}
		println(t)
		return n
	}

	fun conditions(c : String) {
		when (c) {
			in listOf("a","b") -> println("epic")			
			else -> println("cyka blyat")
		}
	}

	companion object {
  		@JvmStatic fun main(args: Array<String>) {
			val multiline ="""a
			|b
			|d
			|c
			|e""".trimMargin()
		
    		println("Ejga $multiline")
			val test = "MEGA"
			println("Test $test")

			val demo = DemoKt()
			println(demo.fibo(20))
			println(demo.foo())
			println(demo.foo(bar = "tada"))
			println(demo.max(1,2,3,4,5,6,7,8000,1001))
			println(demo.max(*listOf(1,2,3,4,5).toIntArray()))
			println(demo.bam(10))
			demo.conditions("a")
			demo.conditions("c")
  		}
  	}
}

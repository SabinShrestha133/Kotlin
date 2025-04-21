package com.example.kotlinclass

fun main(){
    // in kotlin
    println("Hello world")

//    //mutable
//    //we can re assign values to mutable variables
//
//    var age = 20;
//    age = 25
//
//    //immutable
//    // we can't re assign values to immutable variables
//
//    val roll = 15
//    roll = 10

    var a : Boolean = true
    var b : Char = 'R'
    var c : Byte = 12
    var d : Short = - 356
    var e : Int = 43543
    var f : Long = - 51321354L
    var i : Float = 5.6451344F
    var h : Double = 7.32644564
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println (h)


    fun main(args: Array<String>) {
        var age = arrayOf(1, 2, 3)
        println(age)
        println("The first Person age is " + age[0])
        println("The second Person age is " + age[1])
        println("The third Person age is " + age[2])
        println("*****************************")
        var name = arrayOf("ram", "shyam", "Hari")
        name[1] = "Niraj"
        println("The first Person name is " + name[0])
        println("The second Person name is " + name[1])
        println(name.size)

        var Name = arrayListOf<String>("Niraj", "rojan", "shuvayu")
        Name.add("aayush")
        Name.add(4, "Sabin")
        Name.remove("shuvayu")
        Name.removeAt(0)
        println(Name)
    }
}
fun main(){
// Immutable List
    val lst = listOf("mango", "orange", "banana")
    println("Mutable list")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()
// Mutable List
    val mutableLst = mutableListOf("mango", "orange", "banana")
    mutableLst.add("grapes")
    println("Immutable list")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
//for set
        val numbers = setOf(1, 2, 3, 4)
        for (elements in numbers) {
            println(elements)
        }
        val numbersBackwards = setOf(4, 3, 2, 1)
        println("The sets are equal: ${numbers == numbersBackwards}")
//for map
        val countriesCapitals = mapOf(
            "Nepal" to "Kathmandu",
            "China" to "Beijing",
            "India" to "New Delhi")
        println ("All keys : ${countriesCapitals.keys}")
        println("All values : ${countriesCapitals.values}")
        println("Capital of Nepal is : ${countriesCapitals["Nepal"]}")
    }
}
fun main() {
    var num1: Double = 12.4
    var num2: Double = 4.0
    var result: Double = 0.0
    result = num1 + num2
    println("num1 + num2 is $result")
    result = num1 - num2
    println("num1 - num2 is $result")
    result = num1 * num2
    println("num1 * num2 is $result")
    result = num1 / num2
    println("num1 / num2 is $result")
    result = num1 % num2
    println("num1 % num2 is $result")
//Assignment operator
    var x:Int = 35
    var y:Int = 12
    var Z:Int = 0
    Z = x+y
    println("Z = x + y = $Z")
    Z +=x
    println("Z += x = $Z")
    Z -=x
    println("Z -= x = $Z")
    Z *= x
    println("Z *= x = $Z")
    Z /= x
    println("Z /= x = $Z")
    Z %= x
    println("Z %= x = $Z")
//Bodmas
    var output:Int = 5+2*4
    println ("output = "+output)
    output = (5+2) * 4
    println ("output = "+output)
    var X:Int = 10;
    var Y:Int = 12;
    var z:Int = 5;
    var sum:Int = 0;
    sum = X +--Y+--z
    print("x+ --y + --z ::: $sum")
}

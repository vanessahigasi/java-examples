package tech.bts.javaexamples.simpleprogram


    fun main(args: Array<String>) {
        println("Hello, world!")

        //Declare a variable
        var age : Int
        var name : String

        //assign a value
        age = 15

        //declare and assign
        var weight : Double = 40.5

        //type inferred from value (Double)
        var height = 150.0

        if (age >=18) {
            println("adult")
        } else if (age >=13) {
            println("teenager")
        } else {
            println("kid")
        }

        //for loop in range
        for (i in 1..10) {
            println(i)
        }

        var names = mutableListOf<String>()
        names.add("potato")
        names.add("carrot")

        var numbers = listOf(8, 4, 6, 5)

        //can't dot it: numbers.add(3);

        var ages = mutableMapOf<String, Int>()
        ages.put("John",30)
        ages.put("Mary",25)
        println(ages.get("Mary"))


        //constant variables (cant change again)
        val price = 200
        val discount = 10
        val finalPrice = price - discount
        println("The final price is $finalPrice")
        // Cant dot it: finalPrice = price

        printHello("Peter",35)

        val p = power(2.0,10)
        println("2^10 = $p")
    }

fun power(base: Double, exponent: Int) : Double {

    var result = 1.0

    for (i in 1..exponent) {
        result *= base
    }
      return result
}

fun printHello(name: String, age: Int){

    println("hello $name, you are $age")
}
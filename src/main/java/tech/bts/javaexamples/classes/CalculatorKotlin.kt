package tech.bts.javaexamples.classes

//the constructor is right next to the class

class CalculatorKotlin (value: Double){

    //fields
    var value: Double = value
        private set

    var operationCount: Int = 0
        private set

    //methods

    fun add(x: Double) {
        this.value += x
        this.operationCount++
    }

    fun divideBy(x: Double) {
        this.value /= x
        this.operationCount++
    }

    /** resets the value to 0
     * the operation is not modified*/
    fun clear() {
        this.value = 0.0
    }



}
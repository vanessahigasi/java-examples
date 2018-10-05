package tech.bts.javaexamples.classes;

public class Calculator {

    //fields
    private double value;
    private int operationCount;

    //constructor

    public Calculator(double value) {
       this.value = value; //initialize the fields
       this.operationCount = 0;


    }

    //methods

    public void add(double x) {
        this.value = this.value + x; //+=
        this.operationCount++;
    }


    public void divideBy(double x) {
        this.value /= x;
        this.operationCount++;

    }

    /**  resets the value to 0
     * the operation count is not modified
     */
    public void clear() {
        this.value = 0;
    }

    public double getValue() {
        return value;
    }

    public int getOperationCount() {
        return operationCount;
    }
}

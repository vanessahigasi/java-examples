package tech.bts.javaexamples.classes;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator(0); // create an object
        //CalculatorKotlin calc = new CalculatorKotlin(0); // create an object

        calc.add(100.0);
        calc.clear();

        calc.add(7);
        calc.add(3);
        calc.add(5);

        calc.divideBy(3);

        System.out.println("Value: " + calc.getValue());
        System.out.println("Operations: " + calc.getOperationCount());



    }
}

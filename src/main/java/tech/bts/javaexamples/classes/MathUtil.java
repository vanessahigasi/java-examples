package tech.bts.javaexamples.classes;


public class MathUtil {

    // no fields

    public static double power(double base, double exponent) {
        double result = 1; //multiply initial 1 or zero

        for (int i = 1; i <= exponent; i++) {
            result = result * base;

        }

        return result;
    }

    public static double factorial(double n) {

        double result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i; //result *= i
        }

        return result;
    }
}

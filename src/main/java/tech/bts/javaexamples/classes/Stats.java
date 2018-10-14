package tech.bts.javaexamples.classes;

public class Stats {

    //fields
    private double sum;
    private double count;
    private double max;
    private double min;

    //constructor
    public Stats() {
        this.sum = 0;
        this.count = 0;
        this.max = -Double.MAX_VALUE;
        this.min = Double.MAX_VALUE;

    }

    // method
    public void add(double x) {
        this.sum += x;
        this.count++;


        if (x > max) {
            this.max = x;
        }
        if (x < min) {
            this.min = x;
        }
    }

    public double getSum() {
        return sum;
    }

    public double getCount() {
        return count;
    }
    public double getAverage() {
        return sum/count;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

}

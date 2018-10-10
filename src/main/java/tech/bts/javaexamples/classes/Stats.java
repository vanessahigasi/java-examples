package tech.bts.javaexamples.classes;

public class Stats {

    //fields
    private double sum;
    private double count = 0;
    private double average;
    private double max = Double.MAX_VALUE;
    private double min = Double.MIN_VALUE;

    //constructor
    public Stats() {
        this.sum = getSum();
        this.count = getCount();
        this.average = getAverage();
    }

    // method
    public void add(double x) {
        this.sum += x;
        this.count++;
        this.average = sum/count;

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
        return average;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

}

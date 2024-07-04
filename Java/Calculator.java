public class Calculator {
    private String make;
    private String model;

    // constructor method
    public Calculator(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // instance methods
    public String display() {
        return this.make + " " + this.model;
    }

    // instance methods this is a getter
    public String getModel() {
        return this.model;
    }

    // instance methods this is a getter
    public String getMake() {
        return this.make;
    }

    // instance methods this is a setter
    public void setMake(String make) {
        this.make = make;
    }

    // instance methods this is a setter
    public void setModel(String model) {
        this.model = model;
    }

    // instance methods
    public int add(int a, int b) {
        return a + b;
    }

    // instance methods
    public int substract(int a, int b) {
        return a - b;
    }

    // instance methods
    public int multiply(int a, int b) {
        return a * b;
    }

    // instance methods
    public double divide(double a, double b) {
        return a / b;
    }

    // instance methods
    public int square(int a) {
        return a * a;
    }

    // instance methods
    public int cube(int a) {
        return a * a * a;
    }

    // instance methods
    public double power(double a, double b) {
        return Math.pow(a, b);
    }
}

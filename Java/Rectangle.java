public class Rectangle {
    private double width;
    private double length;
    private static int numRectangles = 0;

    public static void staticMethod() {
        System.out.println("This is a static method");
        System.out.println("Number of rectangles: " + numRectangles);
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        // increase static variable
        numRectangles++;
    }

    public Rectangle() {
        this.width = 0.0;
        this.length = 0.0;
        // increase static variable
        numRectangles++;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void display() {
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
    }

    public String toString() {
        return "Width: " + this.width + "\nLength: " + this.length;
    }
}

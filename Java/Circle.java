public class Circle {

    // non static method
    public double calculateArea(int radius) {
        double area = Math.PI * radius * radius;
        // double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    // static method
    public static void printArea(int radius) {

        // creating object
        Circle newCircle = new Circle();
        // running non static method
        double area = newCircle.calculateArea(radius);
        // printing off the area result
        System.out.println("Area of circle with radius " + radius + " is " + area);

    }
}

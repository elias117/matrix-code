public class RectangleQ11 {
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public RectangleQ11(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
        this.perimeter = 2 * length + 2 * width;
    }

    public double getArea() {
        return this.area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
        this.area = length * this.width;
        this.perimeter = 2 * length + 2 * this.width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = this.length * width;
        this.perimeter = 2 * this.length + 2 * width;
    }

    public String toString() {
        return "Rectangle[length=" + this.length + ",width=" + this.width + "]";
    }

}

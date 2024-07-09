public class RectangleDriver {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10.0, 20.0);
        Rectangle r2 = new Rectangle(15.0, 30.0);

        //These two ways of calling the method are equivalent
        System.out.println(r1);
        System.out.println(r1.toString());

        //This is how you call a static method
        Rectangle.staticMethod();
    }
}

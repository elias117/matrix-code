public class CarDriver {
    public static void main(String[] args) {
        String myString = "Hello";
        // myString.length();

        Car mikeCar = new Car("Black", "Ford", "Mustang", 1997);
        mikeCar.DisplayCarDetails();

        System.out.println("New car is being created.");
        Car eliasCar = new Car("White", "Volkswagen", "Golf R", 2019);
        eliasCar.DisplayCarDetails();

        eliasCar.goForward();
    }
}

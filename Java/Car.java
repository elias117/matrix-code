public class Car {
    private String colour;
    private String make;
    private String model;
    private int year;

    // constructor method
    public Car(String colour, String make, String model, int year) {
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // method to display the car's details
    public void DisplayCarDetails() {
        System.out.println("Colour: " + colour);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public void goForward() {
        System.out.println("Car is moving forward.");
    }

    public void goBackward() {
        System.out.println("Car is moving backward.");
    }
}

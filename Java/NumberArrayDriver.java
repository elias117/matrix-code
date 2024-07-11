import java.util.Arrays;
public class NumberArrayDriver {
    public static void main(String[] args) {
        // use non static method
        // create object
        NumberArray na = new NumberArray();
        // use method on the object
        int[] first5Numbers = na.getArray();

        // Print the array
        String arrayString = Arrays.toString(first5Numbers);
        System.out.println(arrayString);


        // use static method
        // use method on the class
        int[] staticFirst5Numbers = NumberArray.getArrayStatic();

        // Print the array
        String staticArrayString = Arrays.toString(staticFirst5Numbers);
        System.out.println(staticArrayString);
    }
}

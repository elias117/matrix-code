public class NumberArray {
    public int[] getArray() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        // I can reference static methods and static variables here
        // This is because static methods and static variables belong to the class
        // int[] staticNumbers = getArrayStatic();
        return numbers;
    }

    public static int[] getArrayStatic() {
        int[] numbers = { 1, 2, 3, 4, 5 };
        // I can't reference non-static methods and non-static variables here
        // This is because non-static methods and non-static variables belong to the object
        // int[] nonStaticNumbers = getArray();
        return numbers;
    }
}

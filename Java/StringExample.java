import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String str = in.next();
        str += 456;
        System.out.println(str);
        int counter = 1;
        while (counter < 100) {
            if ((counter % 10) == 0) {
                System.out.println("Counter is divisible by ten: " + counter);
            } else {
                System.out.println("Counter is not divisible by ten: " + counter);
            }
            counter++;
        }
    }
}
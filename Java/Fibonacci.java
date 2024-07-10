public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Sequence of " + n + " numbers:");

        while(count < n) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            count++;
        }
    }
}

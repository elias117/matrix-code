public class Factorial {
    public static void main(String[] args) {
        int n = 0; // 5! = 5 * 4 * 3 * 2 * 1 = 120
        int answer = 1;
        if (n == 0) {
            answer = 1;
        } else {
            for (int i = n; i >= 1; i--) {
                answer = answer * i;
            }
            // int i = n; // start
            // while(i >= 1) { // condition to stop
            //     answer = answer * i;
            //     i--;
            // }
        }
        System.out.println("The answer is " + answer);
    }
}

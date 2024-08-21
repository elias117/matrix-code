public class Methods {

    public static void printHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // method over loading
    public static int add(int a, int b){
        int answer = a + b;
        return answer;
    }

    // method over loading
    public static int add(int a, int b, int c){
        int answer = a + b + c;
        return answer;
    }


    public static void main(String[] args) {
        // System.out.println("Elias");
        printHello("Elias");

        int sum = add(4,3);
        System.out.println(sum);

        int sum2 = add(4,3,23);
        System.out.println(sum2);


    }
}

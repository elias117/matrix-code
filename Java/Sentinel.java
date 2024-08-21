public class Sentinel {
    // public static void main(String[] args) {
    // String[] data = { "abc", "def", "ghi", "jkl" };
    // String searchedValue = "ghi";
    // int pos = 0;
    // boolean found = false;
    // while (pos < data.length) {
    // if (data[pos].equals(searchedValue)) {
    // found = true;
    // break;
    // } else {
    // found = false;
    // }
    // pos++;
    // }
    // if (found) {
    // System.out.println("Found");
    // } else {
    // System.out.println("Not Found");
    // }

    // }

    // public static char grade(int score) {
    // char returnValue = ' ';
    // if (score >= 9) {
    // returnValue = 'A';
    // } else if (score >= 8) {
    // returnValue = 'B';
    // } else if (score >= 6) {
    // returnValue = 'C';
    // } else if (score > 4) {
    // returnValue = 'D';
    // } else if (score < 4) {
    // returnValue = 'F';
    // }

    // return returnValue;
    // }

    // public static double div2(int n1, int n2) {
    // double returnValue = 0;
    // if (n2 != 0) {
    // returnValue = (double) n1 / n2;
    // }
    // return returnValue;
    // }
    public static void main(String[] args) {
        System.out.println(cost(10, 4));
        // 10101010done
        // cost(10,4);
    }

    public static String cost(int price, int reps) {
        for (int i = 0; i < reps; i++) {
            System.out.print(price);
        }
        return "done";
    }
}

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        for(int i=0; i < numbers.length; i++){
            numbers[i] = i;
        }
        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i]);
        }
        System.out.println();

        int j=0;
        while(j < numbers.length){
            System.out.print(numbers[j]);
            j++;
        }
    }
}

public class CalculatorDriver {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator("Casio", "FX-82ES");
        String displayResult = myCalc.display();
        System.out.println(displayResult);
        int answer = myCalc.add(3, 5);
        System.out.println(answer);
        System.out.println(myCalc.substract(3, 5));
        System.out.println(myCalc.cube(2));

        Calculator myCalc2 = new Calculator("Texas Instruments", "Ti-83");
        System.out.println(myCalc2.getMake());
        System.out.println(myCalc2.getModel());
        String displayResult2 = myCalc2.display();
        System.out.println(displayResult2);
    }
}

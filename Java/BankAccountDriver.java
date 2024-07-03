public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount accountForElias = new BankAccount("Elias", 1000.00);
        BankAccount accountForNate = new BankAccount("Nate");

        accountForNate.Display();

        accountForNate.Deposit(10000);

        System.out.println("New balance after depositing $10,000");
        accountForNate.Display();

        accountForNate.Withdraw(5000);

        System.out.println("New balance after withdrawing $5,000");
        accountForNate.Display();

        accountForNate = new BankAccount("Elias");
        accountForNate.Display();

        String name = "Nate";
        String name2 = new String("Elias");

        // accountForElias.Withdraw(10000);

        // accountForElias.Display();

        // BankAccount accountForMaggi = new BankAccount("Maggi", 100000000.00);

        // BankAccount accountForNate = new BankAccount("Nate");

    }
}

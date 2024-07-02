public class BankAccountDriver {
    public static void main(String[] args) {
        BankAccount accountForElias = new BankAccount("Elias", 1000000.00);

        accountForElias.Display();

        // accountForElias.Withdraw(10000);

        // accountForElias.Display();

        BankAccount accountForMaggi = new BankAccount("Maggi", 100000000.00);

        BankAccount accountForNate = new BankAccount("Nate");

    }
}

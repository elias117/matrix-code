public class BankDriver {
    public static void main(String[] args) {
        Bank elias = new Bank("Elias", 1000.0);
        Bank mike = new Bank("Mike", 500000.0);
        Bank javon = new Bank("javon", 1000000.0);
        Bank derek = new Bank("Derek", 25000.0);

        // elias.calculateInterest();
        // System.out.println(elias.getBalance());

        System.out.println(Bank.getNumberOfAccounts());
        Bank.setInterestRate(0.04);
        System.out.println(Bank.getInterestRate());
    }
}

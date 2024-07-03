public class BankAccount {
    private String name;
    private double balance;

    // constructor method to create a bank account with a name and balance
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void Deposit(double amount) {
        balance = balance + amount;
    }

    public void Withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
            return;
        }
        balance = balance - amount;
    }

    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
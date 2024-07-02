public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(String PassedInName) {
        this.name = PassedInName;
        this.balance = 0.0;
    }

    public void Deposit(double amount) {
        balance = balance + amount;
    }

    public void Withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void Display(){
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
}
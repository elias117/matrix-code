public class Bank {
    // instance variables
    private double balance;
    private String name;

    // static variables
    private static int numberOfAccounts = 0;
    private static double interestRate = 0.02;


    // non static methods
    // constructor
    public Bank(String initialName, double initialBalance) {
        name = initialName;
        balance = initialBalance;
        numberOfAccounts++;
    }

    // getters and setters
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // calculate interest
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
    }

    // static methoods
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

}

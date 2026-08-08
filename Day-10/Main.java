// ==========================================
// BankAccount Class
// ==========================================

class BankAccount {

    // Private fields → Data Hiding
    private int accountNumber;
    private String accountHolder;
    private String accountType;
    private double balance;


    // Constructor
    public BankAccount(int accountNumber,
                       String accountHolder,
                       String accountType,
                       double balance) {

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
        this.balance = balance;
    }


    // Deposit Method
    public boolean deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            return true;
        }

        return false;
    }


    // Withdraw Method
    public boolean withdraw(double amount) {

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }

        return false;
    }


    // Getter for Account Number
    public int getAccountNumber() {
        return accountNumber;
    }


    // Getter for Account Holder
    public String getAccountHolder() {
        return accountHolder;
    }


    // Getter for Account Type
    public String getAccountType() {
        return accountType;
    }


    // Getter for Balance
    public double getBalance() {
        return balance;
    }


    // Display Account Details
    public void displayDetails() {

        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : ₹" + balance);
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("       BANK ACCOUNT MANAGEMENT SYSTEM");
        System.out.println("==========================================");

        // Creating Bank Account
        BankAccount account = new BankAccount(
                101,
                "Jashu",
                "Savings Account",
                50000
        );

        // Account Details
        System.out.println("\n\n---------- ACCOUNT DETAILS ----------\n");

        account.displayDetails();

        // Deposit
        System.out.println("\n\n---------- DEPOSIT ----------\n");

        double depositAmount = 5000;

        System.out.println("Deposit Amount : ₹" + depositAmount);

        if (account.deposit(depositAmount)) {
            System.out.println("Status         : Deposit Successful!");
            System.out.println("Updated Balance: ₹" + account.getBalance());
        }

        // Withdraw
        System.out.println("\n\n---------- WITHDRAW ----------\n");

        double withdrawAmount = 3000;

        System.out.println("Withdraw Amount: ₹" + withdrawAmount);

        if (account.withdraw(withdrawAmount)) {
            System.out.println("Status         : Withdrawal Successful!");
            System.out.println("Updated Balance: ₹" + account.getBalance());
        }

        // Balance Check
        System.out.println("\n\n---------- BALANCE CHECK ----------\n");

        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolder());
        System.out.println("Current Balance: ₹" + account.getBalance());

        // Data Protection
        System.out.println("\n\n---------- DATA PROTECTION ----------\n");

        System.out.println("Account Number : Private");
        System.out.println("Account Holder : Private");
        System.out.println("Balance        : Private");

        System.out.println("\nAccess Method  : Controlled Methods");
        System.out.println("Status         : Encapsulation Applied Successfully!");

        // Completion
        System.out.println("\n\n==========================================");
        System.out.println("          TRANSACTION COMPLETED");
        System.out.println("==========================================");
    }
}




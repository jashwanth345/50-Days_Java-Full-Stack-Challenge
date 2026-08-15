public class Main {

    public static void main(String[] args) {

        BankAccount account =new BankAccount("Jashu",123456789, 10000);

        // Display account
        account.displayAccount();

        // Deposit
        account.deposit(5000);

        // Withdraw
        account.withdraw(2000);

        // Another deposit
        account.deposit(3000);

        // Another withdrawal
        account.withdraw(1000);

        // Display transaction history
        account.showTransactionHistory();
    }
}
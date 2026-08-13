public class BankAccount {

    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public synchronized void deposit(double amount) {

        System.out.println(
            Thread.currentThread().getName()
            + " depositing ₹" + amount
        );

        balance += amount;

        System.out.println(
            "Balance after deposit: ₹" + balance
        );
    }

    public synchronized void withdraw(double amount) {

        System.out.println(
            Thread.currentThread().getName()
            + " withdrawing ₹" + amount
        );

        if (balance >= amount) {

            balance -= amount;

            System.out.println(
                "Balance after withdrawal: ₹" + balance
            );

        } else {

            System.out.println("❌ Insufficient Balance");
        }
    }

    public synchronized double getBalance() {
        return balance;
    }
}
public class Main {

    public static void main(String[] args) {

        // Shared Bank Account
        BankAccount account = new BankAccount(1000);

        // Thread 1 - Deposit
        Thread t1 = new Thread(
            new DepositTask(account, 500),
            "Deposit-Thread"
        );

        // Thread 2 - Withdraw
        Thread t2 = new Thread(
            new WithdrawTask(account, 300),
            "Withdraw-Thread"
        );

        // Thread 3 - Deposit
        Thread t3 = new Thread(
            new DepositTask(account, 200),
            "Deposit-Thread-2"
        );

        // Start all threads
        t1.start();
        t2.start();
        t3.start();

        try {

            // Wait for all transactions to complete
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        // Final Balance
        System.out.println(
            "\n💰 Final Balance: ₹"
            + account.getBalance()
        );
    }
}
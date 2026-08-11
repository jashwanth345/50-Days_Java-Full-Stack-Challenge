import java.util.Scanner;
public class BankApplication {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount account=new BankAccount(5000);
		int choice;
		do {
			System.out.println("\n==============================");
            System.out.println("     BANK TRANSACTION SYSTEM");
            System.out.println("==============================");

            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            try {

                switch (choice) {

                    case 1:
                        account.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = sc.nextDouble();

                        account.deposit(depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = sc.nextDouble();

                        account.withdraw(withdrawAmount);
                        break;

                    case 4:
                        System.out.println("Thank you for using our bank!");
                        break;

                    default:
                        System.out.println("Invalid choice!");

                }
            }
            catch (InsufficientBlanceException e) {

                System.out.println("❌ " + e.getMessage());

            }
            catch (IllegalArgumentException e) {

                System.out.println("❌ " + e.getMessage());

            }
            finally {

                if (choice != 4) {
                    System.out.println("✅ Transaction Completed.");
                }

            }
		}while(choice !=4);
		sc.close();
	}
}

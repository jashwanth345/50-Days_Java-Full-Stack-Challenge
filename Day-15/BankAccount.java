import java.io.*;
public class BankAccount {
	private String accountHolder;
	private long accountNumber;
	private double balance;
	public BankAccount(String accountHolder, long accountNumber, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//Deposit money
	public void deposit(double amount) {
		if(amount<=0) {
			System.out.println("Invalid deposit amount!");
			return;
		}
		balance+=amount;
		String transaction="Deposited:₹"+amount+" | Balance:₹"+balance;
		System.out.println("Deposit successful!");
		System.out.println("Current Balance: ₹"+balance);
		writeTransaction(transaction);
	}
	//withdrawn money
		public void withdraw(double amount) {
			if(amount<=0) {
				System.out.println("Invalid Withdrawal amount!");
				return;
			}
			if(amount>balance) {
				System.out.println("Insufficient balance");
				return;
			}
			balance-=amount;
			String transaction="Withdrawn:₹"+amount+" | Balance:₹"+balance;
			System.out.println("Withdrawal successful!");
			System.out.println("Current Balance: ₹"+balance);
			writeTransaction(transaction);
		}
	private void writeTransaction(String transaction) {
		try {
			FileWriter writer=new FileWriter("transaction.txt",true);
			writer.write(transaction);
			writer.write("\n");
			writer.close();
		} catch (Exception e) {
			System.out.println("error while writing transaction!!");
		}
		
	}
	
	public void showTransactionHistory() {
		System.out.println("\n=====Transaction History=====");
		try {
			BufferedReader reader=new BufferedReader(new FileReader("transaction.txt"));
			String line;
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("Error while reading transaction history!!");
		}
	}
	 public void displayAccount() {

	        System.out.println("\n===== ACCOUNT DETAILS =====");
	        System.out.println("Account Holder: " + accountHolder);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: ₹" + balance);
	    }
	
	
}




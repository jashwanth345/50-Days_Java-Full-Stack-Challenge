public class BankAccount {
	private double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
	public void checkBalance() {
		System.out.println("Current Balance:  ₹"+balance);
	}
	public void deposit(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException(
					"Deposit amount must be greater than 0."
					);
		}
		balance+=amount;
		System.out.println("₹"+ amount+"deposited successfully.");
		
	}
	public void withdraw(double amount) 
		throws InsufficientBlanceException{
			if(amount<=0) {
				throw new IllegalArgumentException(
						"Insufficient balance!"
						);
			}
			balance-=amount;
			System.out.println("₹"+amount+" withdrawn successfully.");;
		}
}

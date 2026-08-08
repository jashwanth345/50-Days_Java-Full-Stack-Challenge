
class CurrentAccount extends BankAccount {
	private double overdrafLimit;
	CurrentAccount(int accountNumber,
			String accountName, double balance, double overdrafLimit) {
		super(accountNumber, accountName, balance);
		this.overdrafLimit=overdrafLimit;
	}
	@Override
	void calculateInterest() {
		System.out.println("Current Account does not earn interest.");
	}
	@Override
	void withdraw(double amount) {
		if(amount>0 && amount<=balance+overdrafLimit) {
			balance-=amount;
			System.out.println("₹" + amount+"withdrawn Successfully.");
		}else {
			System.out.println("Overdraft limit exceeded.");
		}
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Account Type : Current Account");
		System.out.println("Overdraft Limit : ₹"+ overdrafLimit);
	}
}

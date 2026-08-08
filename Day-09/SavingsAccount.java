
 class SavingsAccount extends BankAccount{
	 private double interestRate;
	SavingsAccount(int accountNumber,
			String accountName, double balance, double interestRate) {
		super(accountNumber, accountName, balance);
		this.interestRate=interestRate;
	}
	@Override
	void calculateInterest() {
		double interest=balance*interestRate/100;
		System.out.println("Interest Rate :"+ interestRate +"%");
		System.out.println("Interest Earned: ₹"+interest);
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Account Type : Saving Account");
		System.out.println("Interest Rate :"+ interestRate+"%");
	}
}

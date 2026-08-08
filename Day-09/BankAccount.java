abstract class BankAccount {
	protected int accountNumber;
	protected String accountName;
	protected double balance;
	 BankAccount(int accountNumber,String accountName, double balance) {
		this.accountName=accountName;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	 abstract void calculateInterest();
	 void depoist(double amount) {
		 if(amount>0) {
			 System.out.println("₹"+ amount + " depoisted Successfully.");
		 }else {
			 System.out.println("Invaild deposit amount");
		 }
	 }
	 void withdraw(double amount) {
		 if(amount>0 && amount<=balance) {
			 balance-=amount;
			 System.out.println("₹"+ amount + " Withdrawn Successfully.");
		 }else {
			 System.out.println("Insufficient balance.");
		 }
	 }
	 void displayBalance() {
		 System.out.println("Balance : ₹ "+ balance);
	 } 
	 void displayDetails() {
		 System.out.println("\n-----Account Details-----");
		 System.out.println("Account Number : "+ accountNumber);
		 System.out.println("AccountHolder Name : "+ accountName);
		 System.out.println("Balance : ₹"+ balance);
	 }
}
  
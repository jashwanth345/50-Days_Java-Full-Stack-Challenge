public class Main {
	public static void main(String[] args) {
		//saving bank
		BankAccount savings=new SavingsAccount(
				310,
				"Jashu",
				50000,
				5
				);
		//Current Bank
		BankAccount current=new CurrentAccount(
				298,
				"Yashu",
				40000,
				10000
				);
		//Saving Account operations
		System.out.println("====== SAVINGS ACCOUNT ======");
		savings.displayDetails();
		savings.depoist(5000);
		savings.withdraw(3000);
		savings.displayBalance();
		savings.calculateInterest();
		
		//Current Account operations
				System.out.println("====== CURRENT ACCOUNT ======");
				current.displayDetails();
				current.depoist(10000);
				current.withdraw(45000);
				current.displayBalance();
				current.calculateInterest();
		
	}
}

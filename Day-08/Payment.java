
public class Payment {
	protected String transactionId;
	protected double amount;
	public Payment(String transactionId, double amount) {
		this.transactionId=transactionId;
		this.amount=amount;
	}
	public void processPayment() {
		System.out.println("Processing payment...");
		
	}
	public void displayDetails() {
		System.out.println("Transaction ID : "+transactionId);
		System.out.println("Amount : ₹"+ amount);
	}
}

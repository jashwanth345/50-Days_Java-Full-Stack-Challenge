
public class CreditCardPayment extends Payment {
	private String cardHolderName;
	private String cardNumber;
	public CreditCardPayment(String transactionId, double amount, String cardHolderName, String cardNumber) {
		super(transactionId, amount);
		this.cardHolderName=cardHolderName;
		this.cardNumber=cardNumber;
	}
	@Override
	public void processPayment() {
		System.out.println("Processing ₹"+amount +" through Credit Card...");
		System.out.println("Payment Successful!!");
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Payment Method : Credit Card");
		System.out.println("Card Holder    : "+cardHolderName);
		System.out.println("Card Number    : "+cardNumber);
	}
	
}

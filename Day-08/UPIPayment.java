
public class UPIPayment extends Payment {
	private String upiId;
	public UPIPayment(String transactionId, double amount,String upiId) {
		super(transactionId,amount);
		this.upiId=upiId;
	}
	
	@Override
	public void processPayment() {
		System.out.println("Processing ₹"+amount+" through UPI");
		System.out.println("Payment Successful !!!");
	}
	@Override
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Payment Method : UPI");
		System.out.println("UPI ID         : "+ upiId);
	}
	
}

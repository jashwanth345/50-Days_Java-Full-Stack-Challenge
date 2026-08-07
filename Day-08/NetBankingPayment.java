
	public class NetBankingPayment extends Payment {

	    private String bankName;

	    public NetBankingPayment(String transactionId,
	                             double amount,
	                             String bankName) {

	        super(transactionId, amount);

	        this.bankName = bankName;
	    }

	    @Override
	    public void processPayment() {

	        System.out.println("Processing ₹" + amount + " through Net Banking...");
	        System.out.println("Payment Successful!");
	    }

	    @Override
	    public void displayDetails() {

	        super.displayDetails();

	        System.out.println("Payment Method : Net Banking");
	        System.out.println("Bank Name      : " + bankName);
	    }
	}

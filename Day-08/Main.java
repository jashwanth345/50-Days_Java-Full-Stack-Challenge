public class Main {

    public static void main(String[] args) {

        Payment payment;

        System.out.println("========== UPI PAYMENT ==========");

        payment = new UPIPayment(
                "TXN101",
                1500,
                "jashu@upi"
        );

        payment.displayDetails();
        payment.processPayment();


        System.out.println("\n======= CREDIT CARD PAYMENT =======");

        payment = new CreditCardPayment(
                "TXN102",
                5000,
                "Jashwanth",
                "1234-5678-9012-3456"
        );

        payment.displayDetails();
        payment.processPayment();


        System.out.println("\n======== NET BANKING PAYMENT ========");

        payment = new NetBankingPayment(
                "TXN103",
                10000,
                "State Bank of India"
        );

        payment.displayDetails();
        payment.processPayment();
    }
}
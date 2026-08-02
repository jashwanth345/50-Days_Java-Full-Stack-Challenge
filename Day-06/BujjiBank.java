import java.util.*;
// class BankAccount {
//	private String accountHolder;
//	private long accountnumber;
//	private double balance;
//	
//	static String Bankname="Bujji Bank";
//	static int totalAccounts=0;
//	
//	 BankAccount(String accountHolder, long accountnumber, double balance){
//		  this.accountHolder = accountHolder;
//	      this.accountnumber = accountnumber;
//	      this.balance = balance;
//	      totalAccounts++;
//	}
//	 void deposit(double amount) {
//		 if(amount>0) {
//			 balance+=amount;
//			 System.out.println("Deposited amount : "+ amount);
//		 }else {
//			 System.out.println("Invalid deposit amount.");
//		 }
//	 }
//	 void withdraw(double amount) {
//		 if(amount<=0) {
//			 System.out.println("Invalid withdrawal amount.");
//		 }
//		 else if(amount>balance) {
//			 System.out.println("Insufficient balance...");
//		 }
//		 else {
//			 balance-=amount;
//			 System.out.println("Amount withdrawn successfully.");
//		 }
//	 }
//	 void checkBalance() {
//	        System.out.println("Current Balance: ₹" + balance);
//	    }
//	 
//	 void displayAccountDetails() {
//	        System.out.println("\n----- Account Details -----");
//	        System.out.println("Bank Name      : " + Bankname);
//	        System.out.println("Account Holder : " + accountHolder);
//	        System.out.println("Account Number : " + accountnumber);
//	        System.out.println("Balance        : ₹" + balance);
//	    }
//}
 public class BujjiBank{
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---------Bank Management System----------");
		
		System.out.println("Enter account holder name : ");
		String name=sc.next();
		
		  System.out.print("Enter Account Number: ");
	        long accountnumber = sc.nextLong();

	        System.out.print("Enter Initial Balance: ");
	        double initialBalance = sc.nextDouble();
	        
	        BankAccount account =
	                new BankAccount(name, accountnumber, initialBalance);
	        int choice;
	        do {
	        	System.out.println("\n===== MENU =====");
	            System.out.println("1. Deposit Money");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Display Account Details");
	            System.out.println("5. Total Accounts");
	            System.out.println("6. Exit");

	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();
	            
	            switch(choice) {
	            case 1:
	            	System.out.println("Enter deposit amount : ");
	            	double depositeamount=sc.nextDouble();
	            	account.deposit(depositeamount);
	            	break;
	            case 2:
	            	System.out.println("Enter withdraw amount : ");
	            	double withdrawamount=sc.nextDouble();
	            	account.deposit(withdrawamount);
	            	break;
	            case 3: 
	            	account.checkBalance();
	            	break;
	            
	            case 4:
	            	account.displayAccountDetails();
	            	break;
	            case 5:
	            	System.out.println("Total Accounts : "+ BankAccount.totalAccounts);
	            	break;
	            case 6:
                    System.out.println("Thank you for using our Bank System!");
                    break;
                default:
                	System.out.println(">>>>> Invaild choice <<<<<");
                	break;
	            }
	        }while(choice !=6);
	        sc.close();;
	}
 }
//
//public class BankAccount {
//String AccountHolder;
//double balance;
//	BankAccount(String AccountHolder,double balance){
//		this.AccountHolder=AccountHolder;
//		this.balance=balance;
//	}
//	void depoist(double amount) {
//		balance=balance+amount;
//		System.out.println("Depoisted amount : "+ amount);
//	}
//	void withdraw(double amount) {
//		if(amount<=balance) {
//			balance=balance-amount;
//			System.out.println("Withdraw amount : "+ amount);
//		}
//		else {
//			System.out.println("Insufficient Balance");
//		}
//	}
//	void display() {
//		System.out.println("Account Holder : "+ AccountHolder);
//		System.out.println("Balance : "+ balance);
//	}
//	public static void main(String[] args) {
//		BankAccount account=new BankAccount("Jashu", 5000);
//		
//		account.depoist(3000);
//		account.withdraw(500);
//		account.display();
//	}
//}
class BankAccount {

    private String accountHolder;
    private long accountnumber;
    private double balance;

    static String Bankname = "Bujji Bank";
    static int totalAccounts = 0;

    BankAccount(String accountHolder, long accountnumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountnumber = accountnumber;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited amount : " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance...");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayAccountDetails() {
        System.out.println("\n----- Account Details -----");
        System.out.println("Bank Name      : " + Bankname);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountnumber);
        System.out.println("Balance        : ₹" + balance);
    }
}
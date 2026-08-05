import java.util.*;
class Employee{
	protected int employeeId;
	protected String name;
	protected double basicSalary;
	protected final String company="Panasakayy Private Limited";
	Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }
	double calculateSalary(){
		return basicSalary;
	}
	void displayDetails() {
		  System.out.println("\nCompany Name : " + company);
	      System.out.println("Employee ID  : " + employeeId);
	      System.out.println("Name         : " + name);
	      System.out.println("Basic Salary : ₹" + basicSalary);
	}
	final void companyPolicy() {
		System.out.println("Policy       : Follow company rules and regulations.");
	}
	
}

class Developer extends Employee{
	protected String ProgrammingLanguage;
	protected double Bonus;
	Developer(int employeeId, String name, double basicSalary, String ProgrammingLanguage,
			double Bonus) {
		super(employeeId, name, basicSalary);
		this.ProgrammingLanguage=ProgrammingLanguage;
		this.Bonus=Bonus;
	}
	@Override
    double calculateSalary() {
        return basicSalary + Bonus;
    }
	@Override
	void displayDetails() {
        super.displayDetails();
        System.out.println("Role         : Developer");
        System.out.println("Language     : " + ProgrammingLanguage);
        System.out.println("Bonus        : ₹" + Bonus);
        System.out.println("Total Salary : ₹" + calculateSalary());

        companyPolicy();
    }
}

class Tester extends Employee {

    private String testingType;
    private double bonus;

 
    Tester(int employeeId, String name, double basicSalary,
           String testingType, double bonus) {
        super(employeeId, name, basicSalary);

        this.testingType = testingType;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return basicSalary + bonus;
    }
    @Override
    void displayDetails() {
        super.displayDetails();

        System.out.println("Role         : Tester");
        System.out.println("Testing Type : " + testingType);
        System.out.println("Bonus        : ₹" + bonus);
        System.out.println("Total Salary : ₹" + calculateSalary());

        companyPolicy();
    }
}


class Manager extends Employee {

    private int teamSize;
    private double allowance;
    Manager(int employeeId, String name, double basicSalary,
            int teamSize, double allowance) {

        super(employeeId, name, basicSalary);

        this.teamSize = teamSize;
        this.allowance = allowance;
    }
    @Override
    double calculateSalary() {
        return basicSalary + allowance;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role         : Manager");
        System.out.println("Team Size    : " + teamSize);
        System.out.println("Allowance    : ₹" + allowance);
        System.out.println("Total Salary : ₹" + calculateSalary());

        companyPolicy();
    }
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("======================================");
        System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("======================================");
        
        //Developer Details
        
        System.out.println("\n--- Enter Developer Details ---");

        System.out.print("Employee ID: ");
        int developerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String developerName = sc.nextLine();

        System.out.print("Basic Salary: ");
        double developerSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Programming Language: ");
        String language = sc.nextLine();

        System.out.print("Bonus: ");
        double developerBonus = sc.nextDouble();
        
        //Tester 
        System.out.println("\n--- Enter Tester Details ---");

        System.out.print("Employee ID: ");
        int testerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String testerName = sc.nextLine();

        System.out.print("Basic Salary: ");
        double testerSalary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Testing Type: ");
        String testingType = sc.nextLine();

        System.out.print("Bonus: ");
        double testerBonus = sc.nextDouble();
        
        //Manager 
        System.out.println("\n--- Enter Manager Details ---");

        System.out.print("Employee ID: ");
        int managerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String managerName = sc.nextLine();

        System.out.print("Basic Salary: ");
        double managerSalary = sc.nextDouble();

        System.out.print("Team Size: ");
        int teamSize = sc.nextInt();

        System.out.print("Allowance: ");
        double allowance = sc.nextDouble();
        
        // Creating Object
        Developer developer = new Developer(
                developerId,
                developerName,
                developerSalary,
                language,
                developerBonus
        );

        Tester tester = new Tester(
                testerId,
                testerName,
                testerSalary,
                testingType,
                testerBonus
        );

        Manager manager = new Manager(
                managerId,
                managerName,
                managerSalary,
                teamSize,
                allowance
        );
        
        //Display 
        
        System.out.println("\n\n======================================");
        System.out.println("           EMPLOYEE DETAILS");
        System.out.println("======================================");

        System.out.println("\n---------- DEVELOPER ----------");
        developer.displayDetails();

        System.out.println("\n---------- TESTER -------------");
        tester.displayDetails();

        System.out.println("\n---------- MANAGER ------------");
        manager.displayDetails();

        System.out.println("\n======================================");
        System.out.println("       Program Completed!");
        System.out.println("======================================");

        // Closing Scanner
        sc.close();
        
	}
}
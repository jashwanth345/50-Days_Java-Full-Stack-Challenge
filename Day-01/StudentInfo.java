import java.util.Scanner;
public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=sc.nextLine();
		System.out.println("Enter Roll No. :");
		int roll=sc.nextInt();
		System.out.println("Enter Age : ");
		int age=sc.nextInt();
		System.out.println("Enter Branch:");
		String Branch=sc.next();
		System.out.println("Enter CGPA:");
		double CGPA=sc.nextDouble();
		
		System.out.println("\n---Student Details---");
		System.out.println("Name     : "+name);
		System.out.println("Roll NO. : "+roll);
		System.out.println("Age      : "+age);
		System.out.println("Branch   : "+Branch);
		System.out.println("CGPA     : "+CGPA);
		System.out.println("Name     : "+name);
		
	}
}

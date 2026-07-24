import java.util.*;
public class StudentMarksAnalyzer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Students : ");
		int n=sc.nextInt();
		//create arr
		int[] marks=new int[n];
		//input
		System.out.println("\n Enter Student Marks : ");
		for(int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+": ");
			marks[i]=sc.nextInt();
		}
		//Display:
		System.out.println("\nStudent Marks :");
		for(int i=0;i<n;i++) {
			System.out.println("Student "+(i+1)+": ");
		}
		System.out.println("===Student Reports===");
		
		int h=0;
		int l=0;
		int sum=0;
		int pass=0;
		int fail=0;
		for(int i=0;i<n;i++) {
			sum+=marks[i];
			if(marks[i]>h) {
				h=marks[i];
			}
			if(marks[i]<l) {
				l=marks[i];
			}
			if(marks[i]>35) {
				pass++;
			}
			else{
				fail++;
			}
			
		}
		//calcultate avg
		double avg=(double)sum/n;
		
		//dispaly reports
		System.out.println("Highest Marks : "+ h);
		System.out.println("lowest Marks : "+ l);
		System.out.println("Averger Marks : "+ avg);
		System.out.println("pass Students : "+ pass);
		System.out.println("Fail Students : "+ fail);
		
		//search marks
		System.out.println("\nEnter mark to Search");
		int search=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<n;i++) {
			if(marks[i]==search) {
				System.out.println("Marks Found at Student "+ (i+1));
				found=true;
			}
		}
		if(!found) {
			System.out.println("Marks not Found");
		}
		sc.close();
		
	}
}

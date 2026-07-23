package controlForm;
import java.util.*;
public class GradeCalculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a=sc.nextInt();
	
	if(a>=90) {
		System.out.println("Grade A");
	}
	else if(a>=75) {
		System.out.println("Grade B");
	}
	else if(a>=55) {
		System.out.println("Grade c");
	}
	else {
		System.out.println("Fail");
	}
	sc.close();
}
}

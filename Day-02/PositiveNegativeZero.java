package controlForm;
import java.util.*;
public class PositiveNegativeZero {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of a: ");
	int a=sc.nextInt();
	
	if(a>0) {
		System.out.println(a +" is a Positive no.");
	}
	else if(a<0) {
		System.out.println(a + " is Negative no.");
	}
	else {
		System.out.println(a + " is Zero");
	}
	sc.close();
}
}

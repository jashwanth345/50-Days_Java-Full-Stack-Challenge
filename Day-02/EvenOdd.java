package controlForm;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num: ");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even no.");
		}
		else {
			System.out.println(num+" is Odd no");
		}
	}
}


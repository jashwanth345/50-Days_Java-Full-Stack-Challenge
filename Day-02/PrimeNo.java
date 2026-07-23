package controlForm;
import java.util.*;
public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. : ");
		int num=sc.nextInt();
		boolean prime=true;
		if(num<=1) {
			prime=false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("Prime");
			
		}else {
			System.out.println("Not a Prime No.");
		}
	}
}

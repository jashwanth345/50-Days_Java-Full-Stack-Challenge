package controlForm;
import java.util.*;
public class SumN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
			System.out.println(sum);
		sc.close();
		}
	}
}

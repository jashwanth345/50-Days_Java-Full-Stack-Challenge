
import java.util.*;
public class CountEnven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of an array : ");
	int n=sc.nextInt();
	int[] arr= new int[n];
	System.out.println("Enter the array elements: ");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int count=0;
	for(int i=0;i<n;i++) {
		if(arr[i]%2==0) {
			count++;
		}
	}
	System.out.println("Even Count --> "+count);
}
}

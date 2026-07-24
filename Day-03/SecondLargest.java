
public class SecondLargest {
public static void main(String[] args) {
	int[] arr= {10,20,30,40,50};
	int l=arr[0];
	int s=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>l) {
			s=l;
			l=arr[i];
		}
		else if(arr[i]>s && arr[i]!=l) {
			l=arr[i];
		}
	}
	System.out.println("Second Largest array : "+ s);
}
}

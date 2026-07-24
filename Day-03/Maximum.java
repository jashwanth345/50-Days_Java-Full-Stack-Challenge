
public class Maximum {
public static void main(String[] args) {
	int[] arr= {20,1,2,5,22,55};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println("Maximum Value : "+ max);
}
}

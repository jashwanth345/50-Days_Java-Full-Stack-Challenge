
public class RemoveDuplicate {
public static void main(String[] args) {
	int[] arr= {10,23,10,56,23,33};
	System.out.println("Array without Duplicate: ");
	for(int i=1;i<arr.length;i++) {
		boolean duplicate=false;
		for(int j=1;j<i;j++) {
			if(arr[i]==arr[j]) {
				duplicate=true;
				break;
			}
		}
		if(!duplicate) {
			System.out.print(arr[i]+" ");
		}
	}
}
}

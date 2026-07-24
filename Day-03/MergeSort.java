
public class MergeSort {
public static void main(String[] args) {
	int[] arr1= {10,30,50,70};
	int arr2[]= {20,40,60,80};
	int[] arr3=new int[arr1.length+arr2.length];
	int index=0;
	for(int i=0;i<arr1.length;i++) {
		arr3[index++]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++) {
		arr3[index++]=arr2[i];
	}
	for(int num:arr3) {
		System.out.print(num+ " ");
	}
}
}

package arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8 };
		int[] arr3 = new int[arr.length + arr2.length];

	int i=0;
	int j=0;
	int k=0;
	while(i<arr.length && j<arr2.length) {
		if(arr[i]<arr2[j]) {
			arr3[k++]=arr[i++];
		}
		else {
			arr3[k++]=arr2[j++];
		}
	}
	
	
	while(i<arr.length) {
		arr3[k++]=arr[i++];
	}
	
	while(j<arr2.length) {
		arr3[k++]=arr2[j++];
	}
	
	
	
		for (int a : arr3) {
			System.out.println("" + a);
		}
	}

}

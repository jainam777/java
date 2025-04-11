package arrays;

public class PrintArray {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 23;
		int[] arr2 = { 2, 3, 5, 2, 67 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		for(int i : arr2) {
			System.out.print(i+" ");
		}
	}

}

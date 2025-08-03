package arrays;

public class MaximumSubArray {
	public static void main(String[] args) {
		int[] arr = {1, -2, 3, 5, -1, 2, -1, -5, 4};
		int maxEndingHere = 0;
		int maxSoFar = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);

		}
		System.out.println("Max is:" + maxSoFar);
	}

}

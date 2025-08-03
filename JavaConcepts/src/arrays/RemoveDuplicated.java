package arrays;

public class RemoveDuplicated {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 4, 5, 5, 6 };
		int repeatIndex = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				repeatIndex++;
				arr[repeatIndex] = arr[i + 1];
			}
		}
		for (int a = 0; a < repeatIndex; a++) {
			System.out.print(arr[a] + ",");
		}
	}

}

package arrays;

public class SumArray {
	public static void main(String[] args) {
		int[] arr = {3,4,6,8,6};
		int print= sum(arr);
		System.out.println("Total is "+print);
		
		int cloneArray[] = arr.clone();
		if(arr==cloneArray) {
			System.out.println("both are refer same");
		}

	}
	
	private static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;

	}
	
}



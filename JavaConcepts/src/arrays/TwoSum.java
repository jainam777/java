package arrays;

public class TwoSum {
	public static void main(String[] args) {
	int[] arr= {45,48,50,52,55,56};
	int target = 107;
	twoSum(arr, target);
	}

	private static void twoSum(int[] arr, int target) {
		int left=0;
		int right=arr.length-1;
		while(left < right) {
			int sum=arr[left]+arr[right];
			if(sum==target) {
				System.out.println(arr[left]+", "+arr[right]);
				break;
			}
			if(sum<target) {
				left++;
			}
			 if(sum>target){
				right--;
			}
		}
		 
	}
}

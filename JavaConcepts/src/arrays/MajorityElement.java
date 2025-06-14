package arrays;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		int[] arr = {2, 2, 2, 4, 5, 6};
		int target = 107;
		System.out.println(sort(arr, target));
	}
	

	private static int sort(int[] arr, int target) {
		int count=1, ans=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=ans) {
				count--;
				if(count==0) {
					ans=arr[i];
				}
			}
			count++;
		}
		return ans;
	}
}

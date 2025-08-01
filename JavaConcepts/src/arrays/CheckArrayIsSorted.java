package arrays;

import java.util.Arrays;

public class CheckArrayIsSorted {
	public static void main(String[] args) {
		int[] arr= {74,0,65,0,45,15};
		boolean newArr= check(arr);
		 System.out.println(newArr);
	}

	private static boolean check (int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}



}

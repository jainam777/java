package arrays;

import java.util.Arrays;

public class ShiftByKlements {
	public static void main(String[] args) {
		int[] arr= {74,0,65,0,45,15};
		int input=4;
		System.out.println(Arrays.toString(check(arr,input)));
	}

	private static int[] check (int[] arr, int input) {
		int n= arr.length;
		int[] res = new int[n];
		int k=input;
		k=k%n;
		for(int i=0;i<n;i++) {
			res[i]=arr[(i+k)%n];
		}
		return res;
	}



}

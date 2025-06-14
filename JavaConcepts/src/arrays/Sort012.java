package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort012 {
	public static void main(String[] args) {
		int[] arr= {1,0,1,0,2,1};
		int target = 107;
		System.out.println(Arrays.toString(sort(arr, target)));

	
	}

	private static int[] sort(int[] arr, int target) {
		int i=0,j=0,k=arr.length-1;
		while(j<=k) {
			if(arr[j]==2) {
				int temp = arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				k--;
			}else if(arr[j]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
			}else {
				j++;
			}
		}
		return arr;
	}

}


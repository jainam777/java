package arrays;

import java.util.Arrays;

public class PlatformProblem {
	public static void main(String[] args) {
		int[] arr = {900, 940, 950, 1100, 1500, 1800};
		int[] dep = {910, 1200, 1120, 1130, 1900, 2000};
		int val= findMaxPlatform(arr,dep);
		System.out.print("Val is"+val);
	}
	public static int findMaxPlatform(int[] arr, int[] dep) {
		//Arrays.sort(arr);
		//Arrays.sort(dep);//Sort this only if arrival time and dept time are not sorted if not sorted the data is issue
		int i=0,j=0;
		int platforms=0;
		int maxPlatforms=0;
		while(i<arr.length && j<dep.length) {
			if(arr[i]<dep[j]) {
				platforms++;
				i++;
			}else {
				platforms--;
				j++;
			}
			maxPlatforms=Math.max(maxPlatforms, platforms);
		}
		return maxPlatforms;
	}
	

}

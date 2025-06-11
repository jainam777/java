package arrays;

import java.util.HashMap;

public class TwoSumHashMap {
	public static void main(String[] args) {
		int[] arr= {45,74,32,65,2,45,15};
		int target = 34;
		twoSum(arr, target);
		}

	private static void twoSum(int[] arr, int target) {
		HashMap map= new HashMap();
		for(int i=0;i<arr.length-1;i++) {
			int sum= target-arr[i];
			if(map.containsKey(sum)) {
				System.out.println("["+map.get(sum)+"],"+i);
			}
			map.put(arr[i], i);
		}
	}
}

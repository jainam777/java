package arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveNum {
	public static void main(String[] args) {
		int[] num = { 9, 4, 5, 2, 8, 1, 3 };
		int val = findConseList(num);
		System.out.println("Max::"+val);
	}
	

	private static int findConseList(int[] num) {
		Set<Integer> numSet= new HashSet<>();
		for(int n:num) {
			numSet.add(n);
		}
		int largestCon=0;
		for(int n:numSet) {
			if(!numSet.contains(n-1)) {
				int currentStreak=1;
				int currentNum=n;
				while(numSet.contains(currentNum+1)) {
					currentStreak++;
					currentNum++;
				}
				largestCon= Math.max(largestCon, currentStreak);
			}
		}
		return largestCon;
	}
}

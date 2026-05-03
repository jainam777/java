package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		//String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
		int[][] intervals = {{15, 18}, {1, 3}, {8, 10}, {2, 6}};
		Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
		System.out.println(Arrays.deepToString(intervals));
	}
	
	
	
}

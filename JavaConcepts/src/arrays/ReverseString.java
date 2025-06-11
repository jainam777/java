package arrays;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s = sc.next();
		
		System.out.println(reverseString(s));
		
		
	}

	private static String reverseString(String s) {
		char[] numArr= s.toCharArray();
		int left = 0;
		int right = numArr.length-1;
		while(left != right) {
			numArr[right]=numArr[left];
			left++;
			right--;
		}
		return new String(numArr);
	}

	
	
	

}

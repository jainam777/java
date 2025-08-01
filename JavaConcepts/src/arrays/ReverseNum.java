package arrays;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int res = revNum(num);
		System.out.println("Rev is :" + res);

	}


	private static int revNum(int num) {
		int rev = 0;
		while (num != 0) {
			rev = rev * 10;
			rev += num % 10;

			num = num / 10;
		}
		return rev;
	}

}

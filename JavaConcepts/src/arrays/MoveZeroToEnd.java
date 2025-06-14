package arrays;

import java.util.Arrays;

public class MoveZeroToEnd {
	public static void main(String[] args) {
		int[] arr= {74,0,65,0,45,15};
		int[] newArr= moveToleft(arr);
		 System.out.println(Arrays.toString(newArr));
	}

	private static int[] moveToleft(int[] arr) {
		int count=1, zeroIndex=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0 && zeroIndex==-1) {
				zeroIndex=i;
			}else if(arr[i]!=0 && zeroIndex!=-1) {
				int temp = arr[i];
				arr[i]=arr[zeroIndex];
				arr[zeroIndex]=temp;
				zeroIndex++;
			}
		}
		return arr;
	}

}

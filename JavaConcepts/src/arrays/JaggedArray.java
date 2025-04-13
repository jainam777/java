package arrays;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] jarray = new int[2][];
		jarray[0] = new int[] { 1, 2 };
		jarray[1] = new int[] { 3, 4 ,5};
		
		for(int i=0; i<jarray.length;i++) {
			for(int j=0;j < jarray[i].length;j++) {
				System.out.print(jarray[i][j]+" ");
			}
			System.out.println();
		}
	}
}

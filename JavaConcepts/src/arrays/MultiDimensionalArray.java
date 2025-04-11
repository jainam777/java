package arrays;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] twoArray= new int[2][3];
		twoArray[0][0]=3;
		twoArray[0][1]=5;
		twoArray[0][2]=7;
		
		System.out.println("Length:"+twoArray.length);
		System.out.println("Row::"+twoArray[0].length);
		
		for(int i=0;i<twoArray.length;i++) {
			for(int j=0;j<twoArray[i].length;j++) {
				System.out.print(twoArray[i][j]+" ");
			}
			System.out.println();
		}
	}
	

}

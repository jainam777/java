package arrays;


public class StarPattern {
	public static void main(String[] args) {
		int[] arr= new int[5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Reverse");
		
		for(int i=arr.length;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Right Angled Trainagle");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("Pyramind Angled Trainagle");
		
		for(int i=1;i<arr.length;i++) {
			for(int j = 0; j<arr.length-i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		System.out.println();
		System.out.println("Revers Angled Trainagle");
		
		for(int i=arr.length;i>0;i--) {
			for(int j=0;j<arr.length-i;j++) {
				System.out.print(" ");
			}

			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println();
		System.out.println("Daimond");
		for(int i=1;i<=arr.length;i++) {
			for(int j=0;j<arr.length-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int a=arr.length-1;a>0;a--) {
			for(int b=0;b<arr.length-a;b++) {
				System.out.print(" ");
			}
			for(int c=0;c<2*a-1;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	

}

package oops;

public class ContructorOverloading {
	
	public static int add(int a, int b) throws NullPointerException {
		return a+b;
		
	}
	
	public static void main(String[] args) {
		int a = ContructorOverloading.add(12, 4);
	System.out.println(a);
	}

}
